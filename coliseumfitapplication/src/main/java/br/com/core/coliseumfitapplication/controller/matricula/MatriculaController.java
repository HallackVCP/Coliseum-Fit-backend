package br.com.core.coliseumfitapplication.controller.matricula;


import br.com.core.coliseumfitapplication.dtos.matricula.MatriculaDto;
import br.com.core.coliseumfitapplication.model.matricula.Matricula;
import br.com.core.coliseumfitapplication.model.users.Aluno;
import br.com.core.coliseumfitapplication.repository.matricula.MatriculaRepository;
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


    @PostMapping(value = "/criar-matricula")
    public ResponseEntity<Void> criarMatricula(@RequestBody Aluno aluno, @RequestBody MatriculaDto matriculaDto){
        Matricula matricula = matriculaService.save(matriculaDto);
        matricula.setAluno(aluno);
        matriculaRepository.save(matricula);
        return ResponseEntity.noContent().build();
    }

    @GetMapping (value = "/matriculas")
    public ResponseEntity<List<Matricula>> findAll(){
        return ResponseEntity.ok().body(matriculaService.findAll());
    }

    @PostMapping(value = "/atualizar-matricula/{id}")
    public ResponseEntity<Void> atualizarMatricula(@PathVariable Integer Id, @RequestBody MatriculaDto matriculaDto){

        Matricula matricula = matriculaService.updateById(Id, matriculaDto);

        return ResponseEntity.noContent().build();
    }
}
