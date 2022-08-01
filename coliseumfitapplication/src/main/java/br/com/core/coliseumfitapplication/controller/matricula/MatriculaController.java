package br.com.core.coliseumfitapplication.controller.matricula;


import br.com.core.coliseumfitapplication.dtos.matricula.MatriculaDto;
import br.com.core.coliseumfitapplication.model.matricula.Matricula;
import br.com.core.coliseumfitapplication.model.users.Aluno;
import br.com.core.coliseumfitapplication.repository.matricula.MatriculaRepository;
import br.com.core.coliseumfitapplication.repository.users.AlunoRepository;
import br.com.core.coliseumfitapplication.services.matricula.interfaces.MatriculaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController(value = "/matricula")
public class MatriculaController {


    @Autowired
    MatriculaService matriculaService;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private MatriculaRepository matriculaRepository;

    @Autowired
    private AlunoRepository alunoRepository;




    @PutMapping(value = "/atualizar-matricula/{Id}")
    public ResponseEntity<Aluno> atualizarMatricula(@PathVariable Integer Id, @RequestBody MatriculaDto matriculaDto){

        Matricula matricula = matriculaService.updateById(Id, matriculaDto);
        matricula.getAluno().setMatricula(matricula);
        Aluno aluno = alunoRepository.save(matricula.getAluno());

        return ResponseEntity.ok().body(aluno);
    }
}
