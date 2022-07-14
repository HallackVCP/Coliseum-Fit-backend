package br.com.core.coliseumfitapplication.controller.ficha;


import br.com.core.coliseumfitapplication.dtos.ficha.ExercicioDto;
import br.com.core.coliseumfitapplication.model.ficha.Exercicio;
import br.com.core.coliseumfitapplication.services.ficha.ExercicioServiceImpl;
import br.com.core.coliseumfitapplication.services.ficha.interfaces.ExercicioService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/coliseumfit/exercicio")
public class ExercicioController {

    @Autowired
    ExercicioService exercicioService;

    private final ModelMapper modelMapper;

    public ExercicioController(ExercicioService exercicioService, ModelMapper modelMapper) {
        this.exercicioService = exercicioService;
        this.modelMapper = modelMapper;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ExercicioDto> findById(@PathVariable Integer Id){
        Exercicio exercicio = exercicioService.findById(Id);
        return ResponseEntity.ok().body(modelMapper.map(exercicio, ExercicioDto.class));
    }

    @GetMapping(value = "/listar-exercicios{treinoId}")
    public ResponseEntity<List<ExercicioDto>> findAll(@PathVariable Integer treinoId){
        List<Exercicio> exercicios = exercicioService.findAll(treinoId);
        return ResponseEntity.ok()
                .body(modelMapper.map(exercicios, new TypeToken<List<ExercicioDto>>(){}.getType()));
    }

    @DeleteMapping(value = "/deletar-todos{exercicios}")
    public ResponseEntity<Void> deletarTodos(@PathVariable List<ExercicioDto> exercicioDtoList){
        exercicioService.deleteAll(exercicioDtoList);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/atualizar{id}")
    public ResponseEntity<Void> update(@PathVariable Integer Id, @RequestBody ExercicioDto exercicioDto){
        Exercicio exercicio = exercicioService.updateById(Id, exercicioDto);
        return ResponseEntity.noContent().build();
    }

    @PostMapping(value = "/criar-exercicio")
    public ResponseEntity<Void> criarExercicio(@RequestBody ExercicioDto exercicioDto){
        Exercicio exercicio = exercicioService.salvar(exercicioDto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
                path("/{id}").buildAndExpand(exercicio.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping(value = "/excluir-exercicio{id}")
    public ResponseEntity<Void> deletarExercicio(@PathVariable Integer Id){
        exercicioService.deleteById(Id);
        return ResponseEntity.noContent().build();
    }



}
