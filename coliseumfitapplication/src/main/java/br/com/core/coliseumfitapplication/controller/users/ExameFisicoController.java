package br.com.core.coliseumfitapplication.controller.users;


import br.com.core.coliseumfitapplication.dtos.users.info.ExameFisicoDto;
import br.com.core.coliseumfitapplication.model.users.info.ExameFisico;
import br.com.core.coliseumfitapplication.services.users.interfaces.ExameFisicoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/exame-fisico")
public class ExameFisicoController {

    @Autowired
    private ExameFisicoService exameFisicoService;

    private ModelMapper modelMapper;

    @PostMapping(value = "/inserir-exame-fisico")
    public ResponseEntity<ExameFisicoDto> criarExameFisico(@RequestBody ExameFisicoDto exameFisicoDto){
        ExameFisico exameFisico = exameFisicoService.save(exameFisicoDto);
        return ResponseEntity.ok().body(modelMapper.map(exameFisico, ExameFisicoDto.class));
    }

    @PutMapping(value = "/atualizar-dados-exame-fisico{id}")
    public ResponseEntity<ExameFisicoDto> atualizarExameFisico(@PathVariable Integer Id, @RequestBody ExameFisicoDto exameFisicoDto){
        ExameFisico exameFisico = exameFisicoService.update(Id, exameFisicoDto);
        return ResponseEntity.ok().body(modelMapper.map(exameFisico, ExameFisicoDto.class));
    }
}
