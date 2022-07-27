package br.com.core.coliseumfitapplication.controller.ficha;


import br.com.core.coliseumfitapplication.dtos.ficha.FichaDto;
import br.com.core.coliseumfitapplication.model.ficha.Ficha;
import br.com.core.coliseumfitapplication.model.users.Aluno;
import br.com.core.coliseumfitapplication.repository.ficha.FichaRepository;
import br.com.core.coliseumfitapplication.services.ficha.FichaServiceImpl;
import br.com.core.coliseumfitapplication.services.ficha.interfaces.FichaService;
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
    private FichaService fichaService;

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private FichaRepository fichaRepository;




    @GetMapping(value = "/{id}")
    public ResponseEntity<Ficha> buscarFicha(@PathVariable Integer Id){
        return ResponseEntity.ok().body(fichaService.buscarFicha(Id));
    }

    @PostMapping(value = "/criar-ficha")
    public ResponseEntity<Void> criarFicha(@RequestBody FichaDto fichaDto, @RequestBody Aluno aluno){
        Ficha ficha = fichaService.salvarFicha(fichaDto);
        ficha.setAluno(aluno);
        fichaRepository.save(ficha);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/solicitar-alteracao-ficha{id}")
    public ResponseEntity<Void> solicitarAlteracao(@PathVariable Integer Id, @RequestBody FichaDto fichaDto){
        FichaDto ficha = fichaService.update(Id, fichaDto);
        return ResponseEntity.noContent().build();
    }



}
