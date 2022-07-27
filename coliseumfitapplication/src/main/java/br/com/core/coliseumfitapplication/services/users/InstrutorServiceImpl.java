package br.com.core.coliseumfitapplication.services.users;

import br.com.core.coliseumfitapplication.dtos.users.InstrutorDto;
import br.com.core.coliseumfitapplication.model.users.Aluno;
import br.com.core.coliseumfitapplication.model.users.Instrutor;
import br.com.core.coliseumfitapplication.repository.users.InstrutorRepository;
import br.com.core.coliseumfitapplication.services.exceptions.InvalidUsernameException;
import br.com.core.coliseumfitapplication.services.exceptions.SenhaIncorretaException;
import br.com.core.coliseumfitapplication.services.users.interfaces.InstrutorService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstrutorServiceImpl implements InstrutorService {

    @Autowired
    InstrutorRepository instrutorRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<Instrutor> findAll() {
        return instrutorRepository.findAll();
    }

    @Override
    public Instrutor save(InstrutorDto instrutorDto) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        instrutorDto.setSenha(passwordEncoder.encode(instrutorDto.getSenha()));
        return instrutorRepository.save(modelMapper.map(instrutorDto, Instrutor.class));
    }

    @Override
    public Instrutor findByUsernameAndPassword(String email, String senha) {
        Instrutor instrutor = instrutorRepository.findByEmail(email);
        if(instrutor == null){
            throw new InvalidUsernameException("Nome de usuario incorreto");
        }
        if(instrutor.getSenha().equals(senha)){
            return instrutor;
        }
        else{
            throw new SenhaIncorretaException("Senha incorreta");
        }
    }
}
