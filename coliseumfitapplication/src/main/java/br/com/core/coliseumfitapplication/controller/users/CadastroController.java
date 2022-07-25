package br.com.core.coliseumfitapplication.controller.users;


import br.com.core.coliseumfitapplication.dtos.users.AdministradorDto;
import br.com.core.coliseumfitapplication.dtos.users.AlunoDto;
import br.com.core.coliseumfitapplication.model.users.Administrador;
import br.com.core.coliseumfitapplication.model.users.Aluno;
import br.com.core.coliseumfitapplication.dtos.users.InstrutorDto;
import br.com.core.coliseumfitapplication.model.users.Instrutor;
import br.com.core.coliseumfitapplication.services.users.interfaces.AdministradorService;
import br.com.core.coliseumfitapplication.services.users.interfaces.AlunoService;
import br.com.core.coliseumfitapplication.services.users.interfaces.InstrutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cadastro")
public class CadastroController {

    @Autowired
    AlunoService alunoService;

    @Autowired
    InstrutorService instrutorService;

    @Autowired
    AdministradorService administradorService;

    @PostMapping(value = "/aluno")
    public ResponseEntity<Aluno> cadastroAluno(@RequestBody AlunoDto alunoDto){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        alunoDto.setSenha(passwordEncoder.encode(alunoDto.getSenha()));
        return ResponseEntity.ok().body(alunoService.save(alunoDto));
    }

    @PostMapping(value = "/instrutor")
    public ResponseEntity<Instrutor> cadastroInstrutor(@RequestBody InstrutorDto instrutorDto){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        instrutorDto.setSenha(passwordEncoder.encode(instrutorDto.getSenha()));
        return ResponseEntity.ok().body(instrutorService.save(instrutorDto));
    }

    @PostMapping(value = "/administrador")
    public ResponseEntity<Administrador> cadastroAdministrador(@RequestBody AdministradorDto administradorDto){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        administradorDto.setSenha(passwordEncoder.encode(administradorDto.getSenha()));
        return ResponseEntity.ok().body(administradorService.save(administradorDto));
    }


}
