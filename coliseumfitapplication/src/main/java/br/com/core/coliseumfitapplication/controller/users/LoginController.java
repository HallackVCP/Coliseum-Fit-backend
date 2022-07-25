package br.com.core.coliseumfitapplication.controller.users;


import br.com.core.coliseumfitapplication.dtos.users.LoginDto;
import br.com.core.coliseumfitapplication.model.users.Administrador;
import br.com.core.coliseumfitapplication.model.users.Aluno;
import br.com.core.coliseumfitapplication.model.users.Instrutor;
import br.com.core.coliseumfitapplication.services.users.interfaces.AdministradorService;
import br.com.core.coliseumfitapplication.services.users.interfaces.AlunoService;
import br.com.core.coliseumfitapplication.services.users.interfaces.InstrutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@RestController
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    private AlunoService alunoService;

    @Autowired
    private InstrutorService instrutorService;

    @Autowired
    private AdministradorService administradorService;


    @GetMapping(value = "/aluno")
    public ResponseEntity<Aluno> loginAluno(@RequestBody LoginDto loginDto){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        loginDto.setPassword(passwordEncoder.encode(loginDto.getPassword()));
        return ResponseEntity.ok().
                body(alunoService.findByUsernameAndPassword(loginDto.getUsername(), loginDto.getPassword()));
    }

    @GetMapping(value = "/instrutor")
    public ResponseEntity<Instrutor> loginInstrutor(@RequestBody LoginDto loginDto){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        loginDto.setPassword(passwordEncoder.encode(loginDto.getPassword()));
        return ResponseEntity.ok().
                body(instrutorService.findByUsernameAndPassword(loginDto.getUsername(), loginDto.getPassword()));
    }

    @GetMapping(value = "/administrador")
    public ResponseEntity<Administrador> loginAdministrador(@RequestBody LoginDto loginDto){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        loginDto.setPassword(passwordEncoder.encode(loginDto.getPassword()));
        return ResponseEntity.ok().
                body(administradorService.findByUsernameAndPassword(loginDto.getUsername(), loginDto.getPassword()));
    }
}
