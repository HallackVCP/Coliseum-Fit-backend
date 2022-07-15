package com.auth.oauth.controller;

import com.auth.oauth.dtos.CadastroAlunoDto;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/cadastro-aluno")
public class AlunoCadastroController {

    @PostMapping(value = "/cadastro")
    public ResponseEntity<Void> cadastrarAluno(@RequestBody CadastroAlunoDto cadastroAlunoDTO){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        cadastroAlunoDTO.setSenha(passwordEncoder.encode(cadastroAlunoDTO.getSenha()));
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
                path("/{id}").buildAndExpand(cadastroAlunoDTO).toUri();
        return ResponseEntity.created(uri).build();

    }
}
