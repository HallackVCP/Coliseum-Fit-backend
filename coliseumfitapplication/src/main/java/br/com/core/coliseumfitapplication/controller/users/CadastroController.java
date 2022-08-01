package br.com.core.coliseumfitapplication.controller.users;


import br.com.core.coliseumfitapplication.dtos.ficha.FichaDto;
import br.com.core.coliseumfitapplication.dtos.matricula.MatriculaDto;
import br.com.core.coliseumfitapplication.dtos.users.AdministradorDto;
import br.com.core.coliseumfitapplication.dtos.users.AlunoDto;
import br.com.core.coliseumfitapplication.dtos.users.info.ExameFisicoDto;
import br.com.core.coliseumfitapplication.model.ficha.Ficha;
import br.com.core.coliseumfitapplication.model.matricula.Matricula;
import br.com.core.coliseumfitapplication.model.users.Administrador;
import br.com.core.coliseumfitapplication.model.users.Aluno;
import br.com.core.coliseumfitapplication.dtos.users.InstrutorDto;
import br.com.core.coliseumfitapplication.model.users.Instrutor;
import br.com.core.coliseumfitapplication.model.users.info.ExameFisico;
import br.com.core.coliseumfitapplication.repository.ficha.FichaRepository;
import br.com.core.coliseumfitapplication.repository.matricula.MatriculaRepository;
import br.com.core.coliseumfitapplication.repository.users.AlunoRepository;
import br.com.core.coliseumfitapplication.repository.users.info.ExameFisicoRepository;
import br.com.core.coliseumfitapplication.services.ficha.interfaces.FichaService;
import br.com.core.coliseumfitapplication.services.matricula.interfaces.MatriculaService;
import br.com.core.coliseumfitapplication.services.users.interfaces.AdministradorService;
import br.com.core.coliseumfitapplication.services.users.interfaces.AlunoService;
import br.com.core.coliseumfitapplication.services.users.interfaces.ExameFisicoService;
import br.com.core.coliseumfitapplication.services.users.interfaces.InstrutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/cadastro")
public class CadastroController {

    @Autowired
    AlunoService alunoService;

    @Autowired
    InstrutorService instrutorService;

    @Autowired
    AdministradorService administradorService;

    @Autowired
    MatriculaService matriculaService;

    @Autowired
    ExameFisicoService exameFisicoService;

    @Autowired
    FichaService fichaService;

    @Autowired
    FichaRepository fichaRepository;

    @Autowired
    AlunoRepository alunoRepository;

    @Autowired
    MatriculaRepository matriculaRepository;

    @Autowired
    ExameFisicoRepository exameFisicoRepository;

    @PostMapping(value = "/aluno")
    public ResponseEntity<Aluno> cadastroAluno(@RequestBody AlunoDto alunoDto){
        return ResponseEntity.ok().body(alunoService.save(alunoDto));
    }

    @PostMapping(value = "/instrutor")
    public ResponseEntity<Instrutor> cadastroInstrutor(@RequestBody InstrutorDto instrutorDto){

        return ResponseEntity.ok().body(instrutorService.save(instrutorDto));
    }

    @PostMapping(value = "/administrador")
    public ResponseEntity<Administrador> cadastroAdministrador(@RequestBody AdministradorDto administradorDto){
        return ResponseEntity.ok().body(administradorService.save(administradorDto));
    }

    @PostMapping(value = "/matricula/{IdAluno}")
    public ResponseEntity<Aluno> cadastrarMatricula(@RequestBody MatriculaDto matriculaDto, @PathVariable Integer IdAluno){
        Matricula matricula = matriculaService.save(matriculaDto);
        Aluno aluno = alunoService.findById(IdAluno);
        aluno.setMatricula(matricula);
        matricula.setAluno(aluno);
        alunoRepository.save(aluno);
        matriculaRepository.save(matricula);
        return ResponseEntity.ok().body(aluno);
    }

    @PostMapping(value = "/exame-fisico/{IdAluno}")
    public ResponseEntity<Aluno> criarExameFisico(@RequestBody ExameFisicoDto exameFisicoDto, @PathVariable Integer IdAluno){
        ExameFisico exameFisico = exameFisicoService.save(exameFisicoDto);
        Aluno aluno = alunoService.findById(IdAluno);
        aluno.setExameFisico(exameFisico);
        exameFisico.setAluno(aluno);
        alunoRepository.save(aluno);
        exameFisicoRepository.save(exameFisico);
        return ResponseEntity.ok().body(aluno);
    }

    @PostMapping(value = "/ficha/{IdAluno}")
    public ResponseEntity<Aluno> criarFicha(@RequestBody FichaDto fichaDto, @PathVariable Integer IdAluno){
        Ficha ficha = fichaService.salvarFicha(fichaDto);
        Aluno aluno = alunoService.findById(IdAluno);
        aluno.setFicha(ficha);
        ficha.setAluno(aluno);
        alunoRepository.save(aluno);
        fichaRepository.save(ficha);
        return ResponseEntity.ok().body(aluno);
    }


}
