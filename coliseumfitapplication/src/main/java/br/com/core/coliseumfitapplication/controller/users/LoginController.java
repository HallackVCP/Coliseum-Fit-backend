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
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    private AlunoService alunoService;

    @Autowired
    private InstrutorService instrutorService;

    @Autowired
    private AdministradorService administradorService;


    @PostMapping(value = "/aluno")
    public ResponseEntity<Aluno> loginAluno(@RequestBody LoginDto loginDto){
        return ResponseEntity.ok().
                body(alunoService.findByUsernameAndPassword(loginDto.getUsername(), loginDto.getPassword()));
    }

    @PostMapping(value = "/instrutor")
    public ResponseEntity<Instrutor> loginInstrutor(@RequestBody LoginDto loginDto){
        return ResponseEntity.ok().
                body(instrutorService.findByUsernameAndPassword(loginDto.getUsername(), loginDto.getPassword()));
    }

    @PostMapping(value = "/administrador")
    public ResponseEntity<Administrador> loginAdministrador(@RequestBody LoginDto loginDto){
        return ResponseEntity.ok().
                body(administradorService.findByUsernameAndPassword(loginDto.getUsername(), loginDto.getPassword()));
    }
}
