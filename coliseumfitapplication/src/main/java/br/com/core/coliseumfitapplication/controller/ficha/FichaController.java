package br.com.core.coliseumfitapplication.controller.ficha;


import br.com.core.coliseumfitapplication.dtos.ficha.FichaDto;
import br.com.core.coliseumfitapplication.model.ficha.Ficha;
import br.com.core.coliseumfitapplication.services.ficha.FichaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;


@RestController
@RequestMapping(value = "/coliseumfit/ficha")
public class FichaController {

    @Autowired
    private FichaServiceImpl fichaService;




    @GetMapping(value = "/{id}")
    public ResponseEntity<Ficha> buscarFicha(@PathVariable Integer Id){
        return ResponseEntity.ok().body(fichaService.buscarFicha(Id));
    }

    @PostMapping(value = "/criar-ficha")
    public ResponseEntity<Void> criarFicha(@RequestBody FichaDto fichaDto){
        Ficha ficha = fichaService.salvarFicha(fichaDto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
                path("/{id}").buildAndExpand(ficha.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }



}
