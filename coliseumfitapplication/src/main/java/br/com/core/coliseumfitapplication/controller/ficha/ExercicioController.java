package br.com.core.coliseumfitapplication.controller.ficha;


import br.com.core.coliseumfitapplication.dtos.ficha.ExercicioDto;
import br.com.core.coliseumfitapplication.model.ficha.Exercicio;
import br.com.core.coliseumfitapplication.model.ficha.Treino;
import br.com.core.coliseumfitapplication.repository.ficha.ExercicioRepository;
import br.com.core.coliseumfitapplication.repository.ficha.TreinoRepository;
import br.com.core.coliseumfitapplication.services.ficha.ExercicioServiceImpl;
import br.com.core.coliseumfitapplication.services.ficha.interfaces.ExercicioService;
import br.com.core.coliseumfitapplication.services.ficha.interfaces.TreinoService;
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

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ExercicioRepository exercicioRepository;

    @Autowired
    private TreinoRepository treinoRepository;

    @Autowired
    private TreinoService treinoService;



    @GetMapping(value = "/{Id}")
    public ResponseEntity<ExercicioDto> findById(@PathVariable Integer Id){
        Exercicio exercicio = exercicioService.findById(Id);
        return ResponseEntity.ok().body(modelMapper.map(exercicio, ExercicioDto.class));
    }

    @GetMapping(value = "/listar-exercicios")
    public ResponseEntity<List<Exercicio>> findAll(@RequestBody Treino treino){
        List<Exercicio> exercicios = exercicioService.findAll(treino);
        return ResponseEntity.ok()
                .body(exercicios);
    }

    @DeleteMapping(value = "/deletar-todos")
    public ResponseEntity<Void> deletarTodos(@RequestBody List<Exercicio> exercicioList){
        exercicioService.deleteAll(exercicioList);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/atualizar/{Id}")
    public ResponseEntity<Void> update(@PathVariable Integer Id, @RequestBody ExercicioDto exercicioDto){
        Exercicio exercicio = exercicioService.updateById(Id, exercicioDto);
        return ResponseEntity.noContent().build();
    }

    @PostMapping(value = "/criar-exercicio/{IdTreino}")
    public ResponseEntity<Void> criarExercicio(@RequestBody ExercicioDto exercicioDto, @PathVariable Integer IdTreino){
        Exercicio exercicio = exercicioService.salvar(exercicioDto);
        Treino treino = treinoService.findById(IdTreino);
        exercicio.setTreino(treino);
        treino.getExercicios().add(exercicio);
        exercicioRepository.save(exercicio);
        treinoRepository.save(treino);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping(value = "/excluir-exercicio/{Id}")
    public ResponseEntity<Void> deletarExercicio(@PathVariable Integer Id){
        exercicioService.deleteById(Id);
        return ResponseEntity.noContent().build();
    }





}
