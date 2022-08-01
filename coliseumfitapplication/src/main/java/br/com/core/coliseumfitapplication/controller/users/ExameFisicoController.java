package br.com.core.coliseumfitapplication.controller.users;


import br.com.core.coliseumfitapplication.dtos.users.info.ExameFisicoDto;
import br.com.core.coliseumfitapplication.model.users.Aluno;
import br.com.core.coliseumfitapplication.model.users.info.ExameFisico;
import br.com.core.coliseumfitapplication.repository.users.AlunoRepository;
import br.com.core.coliseumfitapplication.repository.users.info.ExameFisicoRepository;
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

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private AlunoRepository alunoRepository;


    @PutMapping(value = "/atualizar-dados-exame-fisico{Id}")
    public ResponseEntity<Aluno> atualizarExameFisico(@PathVariable Integer Id, @RequestBody ExameFisicoDto exameFisicoDto){
        ExameFisico exameFisico = exameFisicoService.update(Id, exameFisicoDto);
        exameFisico.getAluno().setExameFisico(exameFisico);
        Aluno aluno = alunoRepository.save(exameFisico.getAluno());
        return ResponseEntity.ok().body(aluno);
    }
}
