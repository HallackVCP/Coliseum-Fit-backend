package br.com.core.coliseumfitapplication.controller.users;


import br.com.core.coliseumfitapplication.dtos.users.AlunoDto;
import br.com.core.coliseumfitapplication.model.ficha.Exercicio;
import br.com.core.coliseumfitapplication.model.users.Aluno;
import br.com.core.coliseumfitapplication.model.users.Instrutor;
import br.com.core.coliseumfitapplication.services.users.interfaces.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @PostMapping(value = "/criar-aluno")
    public ResponseEntity<Aluno> criarAluno(@RequestBody AlunoDto alunoDto){
        Aluno aluno = alunoService.save(alunoDto);
        return ResponseEntity.ok().body(aluno);
    }

    @GetMapping(value = "/findAll")
    public ResponseEntity<List<Aluno>> findAll(@RequestBody Instrutor instrutor){
        List<Aluno> alunos = alunoService.findAll(instrutor);
        return ResponseEntity.ok().body(alunos);
    }
}
