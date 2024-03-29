package br.com.core.coliseumfitapplication.services.users;

import br.com.core.coliseumfitapplication.dtos.users.AdministradorDto;
import br.com.core.coliseumfitapplication.model.users.Administrador;
import br.com.core.coliseumfitapplication.model.users.Aluno;
import br.com.core.coliseumfitapplication.repository.users.AdministradorRepository;
import br.com.core.coliseumfitapplication.services.exceptions.InvalidUsernameException;
import br.com.core.coliseumfitapplication.services.exceptions.SenhaIncorretaException;
import br.com.core.coliseumfitapplication.services.users.interfaces.AdministradorService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AdministradorServiceImpl implements AdministradorService {

    @Autowired
    AdministradorRepository administradorRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public Administrador save(AdministradorDto administradorDto) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        administradorDto.setSenha(passwordEncoder.encode(administradorDto.getSenha()));
        return administradorRepository.save(modelMapper.map(administradorDto, Administrador.class));
    }

    @Override
    public Administrador findByUsernameAndPassword(String email, String senha) {
        Administrador administrador = administradorRepository.findByEmail(email);
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        if(administrador == null){
            throw new InvalidUsernameException("Nome de usuario incorreto");
        }
        if(passwordEncoder.matches(senha, administrador.getSenha())){
            return administrador;
        }
        else{
            throw new SenhaIncorretaException("Senha incorreta");
        }
    }
}
