package br.com.core.coliseumfitapplication.controller.ficha;


import br.com.core.coliseumfitapplication.dtos.ficha.FichaDto;
import br.com.core.coliseumfitapplication.model.ficha.Ficha;
import br.com.core.coliseumfitapplication.model.users.Aluno;
import br.com.core.coliseumfitapplication.services.ficha.FichaServiceImpl;
import org.modelmapper.ModelMapper;
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

    private final ModelMapper modelMapper;

    public FichaController(ModelMapper modelMapper, FichaServiceImpl fichaService) {
        this.modelMapper = modelMapper;
        this.fichaService = fichaService;
    }


    @GetMapping(value = "/{id}")
    public ResponseEntity<Ficha> buscarFicha(@PathVariable Integer Id){
        return ResponseEntity.ok().body(fichaService.buscarFicha(Id));
    }

    @PostMapping(value = "/criar-ficha{aluno}")
    public ResponseEntity<Void> criarFicha(@PathVariable Aluno aluno,  @RequestBody FichaDto fichaDto){
        Ficha ficha = fichaService.salvarFicha(fichaDto, aluno);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/solicitar-alteracao-ficha{id}")
    public ResponseEntity<Void> solicitarAlteracao(@PathVariable Integer Id, @RequestBody FichaDto fichaDto){
        FichaDto ficha = fichaService.update(Id, fichaDto);
        return ResponseEntity.noContent().build();
    }



}
