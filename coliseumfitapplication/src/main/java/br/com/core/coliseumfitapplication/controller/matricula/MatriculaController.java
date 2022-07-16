package br.com.core.coliseumfitapplication.controller.matricula;


import br.com.core.coliseumfitapplication.dtos.matricula.MatriculaDto;
import br.com.core.coliseumfitapplication.model.matricula.Matricula;
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

    private ModelMapper modelMapper;


    @PostMapping(value = "/criar-matricula/{Id}")
    public ResponseEntity<MatriculaDto> criarMatricula(@PathVariable Integer Id, @RequestBody MatriculaDto matriculaDto){
        Matricula matricula = matriculaService.save(matriculaDto, Id);
        return ResponseEntity.ok().body(modelMapper.map(matricula, MatriculaDto.class));
    }

    @GetMapping (value = "/matriculas")
    public ResponseEntity<List<Matricula>> findAll(){
        return ResponseEntity.ok().body(matriculaService.findAll());
    }
}
