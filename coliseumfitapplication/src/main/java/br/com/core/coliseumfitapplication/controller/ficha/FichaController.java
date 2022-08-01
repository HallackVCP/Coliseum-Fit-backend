package br.com.core.coliseumfitapplication.controller.ficha;


import br.com.core.coliseumfitapplication.dtos.ficha.FichaDto;
import br.com.core.coliseumfitapplication.model.ficha.Ficha;
import br.com.core.coliseumfitapplication.model.users.Aluno;
import br.com.core.coliseumfitapplication.repository.ficha.FichaRepository;
import br.com.core.coliseumfitapplication.repository.users.AlunoRepository;
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

    @Autowired
    private AlunoRepository alunoRepository;



    @GetMapping(value = "/{Id}")
    public ResponseEntity<Ficha> buscarFicha(@PathVariable Integer Id){
        return ResponseEntity.ok().body(fichaService.buscarFicha(Id));
    }



    @PutMapping(value = "/solicitar-alteracao-ficha{Id}")
    public ResponseEntity<Aluno> solicitarAlteracao(@PathVariable Integer Id, @RequestBody FichaDto fichaDto){
        Ficha ficha = fichaService.update(Id, fichaDto);
        ficha.getAluno().setFicha(ficha);
        alunoRepository.save(ficha.getAluno());
        return ResponseEntity.ok().body(ficha.getAluno());
    }



}
