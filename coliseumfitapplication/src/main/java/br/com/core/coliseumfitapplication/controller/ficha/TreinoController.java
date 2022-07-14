package br.com.core.coliseumfitapplication.controller.ficha;


import br.com.core.coliseumfitapplication.dtos.ficha.TreinoDto;
import br.com.core.coliseumfitapplication.model.ficha.Ficha;
import br.com.core.coliseumfitapplication.model.ficha.Treino;
import br.com.core.coliseumfitapplication.services.ficha.TreinoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/treino")
public class TreinoController {


    @Autowired
    private TreinoServiceImpl treinoService;

    @GetMapping(value = "/treino{id}")
    public ResponseEntity<Treino> buscarTreino(@PathVariable Integer Id){
        return ResponseEntity.ok().body(treinoService.findById(Id));
    }

    @PostMapping(value = "criar-treino")
    public ResponseEntity<Void> salvarTreino(@RequestBody TreinoDto treinoDto){
        Treino treino = treinoService.salvarTreino(treinoDto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
                path("/{id}").buildAndExpand(treino.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping(value = "/buscar-treinos")
    public ResponseEntity<List<TreinoDto>> findAllTreinosFica(Ficha ficha){
        return ResponseEntity.ok().body(treinoService.findAllByFicha(ficha));
    }


}
