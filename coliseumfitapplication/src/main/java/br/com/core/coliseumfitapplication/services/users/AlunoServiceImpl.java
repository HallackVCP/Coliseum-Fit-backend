package br.com.core.coliseumfitapplication.services.users;

import br.com.core.coliseumfitapplication.dtos.users.AlunoDto;
import br.com.core.coliseumfitapplication.model.ficha.Exercicio;
import br.com.core.coliseumfitapplication.model.users.Aluno;
import br.com.core.coliseumfitapplication.model.users.Instrutor;
import br.com.core.coliseumfitapplication.repository.users.AlunoRepository;
import br.com.core.coliseumfitapplication.services.exceptions.InvalidUsernameException;
import br.com.core.coliseumfitapplication.services.exceptions.ObjectNotFoundException;
import br.com.core.coliseumfitapplication.services.exceptions.SenhaIncorretaException;
import br.com.core.coliseumfitapplication.services.users.interfaces.AlunoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    @Autowired
    private ModelMapper modelMapper;



    @Override
    public Aluno save(AlunoDto alunoDto) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        alunoDto.setSenha(passwordEncoder.encode(alunoDto.getSenha()));
        return alunoRepository.save(modelMapper.map(alunoDto, Aluno.class));
    }

    @Override
    public List<Aluno> findAll(Instrutor instrutor) {
        return alunoRepository.findAllByInstrutor(instrutor);
    }

    @Override
    public Aluno findById(Integer Id) {
        Optional<Aluno> alunoOptional = alunoRepository.findById(Id);
        if(alunoOptional.isPresent()){
            return alunoOptional.get();
        }
        else{
            throw new ObjectNotFoundException("Objeto não encontrado! Id: " + Id + ", Tipo: " + Aluno.class);
        }
    }

    @Override
    public Aluno findByUsernameAndPassword(String email, String senha) {
        Aluno aluno = alunoRepository.findByEmail(email);
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        if(aluno == null){
            throw new InvalidUsernameException("Nome de usuario incorreto");
        }
        if(passwordEncoder.matches(senha, aluno.getSenha())){
            return aluno;
        }
        else{
            throw new SenhaIncorretaException("Senha incorreta: "+ aluno.getSenha());
        }
    }
}
