package br.com.core.coliseumfitapplication.controller.ficha;


import br.com.core.coliseumfitapplication.dtos.ficha.TreinoDto;
import br.com.core.coliseumfitapplication.model.ficha.Ficha;
import br.com.core.coliseumfitapplication.model.ficha.Treino;
import br.com.core.coliseumfitapplication.services.ficha.TreinoServiceImpl;
import br.com.core.coliseumfitapplication.services.ficha.interfaces.TreinoService;
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
    private TreinoService treinoService;

    @GetMapping(value = "/treino{id}")
    public ResponseEntity<Treino> buscarTreino(@PathVariable Integer Id){
        return ResponseEntity.ok().body(treinoService.findById(Id));
    }

    @PostMapping(value = "criar-treino")
    public ResponseEntity<Void> salvarTreino(@RequestBody TreinoDto treinoDto){
        Treino treino = treinoService.salvarTreino(treinoDto);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/buscar-treinos")
    public ResponseEntity<List<Treino>> findAllTreinosFicha(Ficha ficha){
        return ResponseEntity.ok().body(treinoService.findAllByFicha(ficha));
    }


}
