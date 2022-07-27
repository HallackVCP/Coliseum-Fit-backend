package br.com.core.coliseumfitapplication;

import br.com.core.coliseumfitapplication.dtos.ficha.ExercicioDto;
import br.com.core.coliseumfitapplication.dtos.ficha.FichaDto;
import br.com.core.coliseumfitapplication.dtos.ficha.TreinoDto;
import br.com.core.coliseumfitapplication.dtos.matricula.MatriculaDto;
import br.com.core.coliseumfitapplication.dtos.users.AdministradorDto;
import br.com.core.coliseumfitapplication.dtos.users.AlunoDto;
import br.com.core.coliseumfitapplication.dtos.users.InstrutorDto;
import br.com.core.coliseumfitapplication.dtos.users.info.ExameFisicoDto;
import br.com.core.coliseumfitapplication.model.ficha.Exercicio;
import br.com.core.coliseumfitapplication.model.ficha.Ficha;
import br.com.core.coliseumfitapplication.model.ficha.Treino;
import br.com.core.coliseumfitapplication.model.matricula.Matricula;
import br.com.core.coliseumfitapplication.model.users.Administrador;
import br.com.core.coliseumfitapplication.model.users.Aluno;
import br.com.core.coliseumfitapplication.model.users.Instrutor;
import br.com.core.coliseumfitapplication.model.users.info.ExameFisico;
import br.com.core.coliseumfitapplication.repository.ficha.ExercicioRepository;
import br.com.core.coliseumfitapplication.repository.ficha.FichaRepository;
import br.com.core.coliseumfitapplication.repository.ficha.TreinoRepository;
import br.com.core.coliseumfitapplication.repository.matricula.MatriculaRepository;
import br.com.core.coliseumfitapplication.repository.users.AdministradorRepository;
import br.com.core.coliseumfitapplication.repository.users.AlunoRepository;
import br.com.core.coliseumfitapplication.repository.users.InstrutorRepository;
import br.com.core.coliseumfitapplication.repository.users.info.ExameFisicoRepository;
import br.com.core.coliseumfitapplication.services.ficha.interfaces.ExercicioService;
import br.com.core.coliseumfitapplication.services.ficha.interfaces.FichaService;
import br.com.core.coliseumfitapplication.services.ficha.interfaces.TreinoService;
import br.com.core.coliseumfitapplication.services.matricula.interfaces.MatriculaService;
import br.com.core.coliseumfitapplication.services.users.interfaces.AdministradorService;
import br.com.core.coliseumfitapplication.services.users.interfaces.AlunoService;
import br.com.core.coliseumfitapplication.services.users.interfaces.ExameFisicoService;
import br.com.core.coliseumfitapplication.services.users.interfaces.InstrutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ColiseumfitapplicationApplication implements CommandLineRunner {

    @Autowired
    private AdministradorService administradorService;

    @Autowired
    private AlunoService alunoService;

    @Autowired
    private InstrutorService instrutorService;

    @Autowired
    private FichaService fichaService;

    @Autowired
    private MatriculaService matriculaService;

    @Autowired
    private ExameFisicoService exameFisicoService;

    @Autowired
    private TreinoService treinoService;

    @Autowired
    private ExercicioService exercicioService;

    @Autowired
    private AdministradorRepository administradorRepository;

    @Autowired
    private InstrutorRepository instrutorRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private FichaRepository fichaRepository;

    @Autowired
    private MatriculaRepository matriculaRepository;

    @Autowired
    private ExameFisicoRepository exameFisicoRepository;

    @Autowired
    private TreinoRepository treinoRepository;

    @Autowired
    private ExercicioRepository exercicioRepository;

    public static void main(String[] args) {
        SpringApplication.run(ColiseumfitapplicationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception{
        AdministradorDto administradorDto = new AdministradorDto("João", "12345678910", "joao@admin.com", "32323232", "qwerrty");
        Administrador administrador = administradorService.save(administradorDto);

        InstrutorDto instrutorDto = new InstrutorDto("Diniz", "12345678911", "diniz@coliseum.com", "32323232", "abcw");

        Instrutor instrutor = instrutorService.save(instrutorDto);

        InstrutorDto instrutorDto1 = new InstrutorDto("Guilherme", "12345678920", "guilherme@coliseum.com", "32323232", "1234");

        Instrutor instrutor1 = instrutorService.save(instrutorDto1);

        AlunoDto alunoDto = new AlunoDto("Pedro", "12345678912", "pedro@gmail.com", "32323232", "asdf");
        Aluno aluno = alunoService.save(alunoDto);
        AlunoDto alunoDto1 = new AlunoDto("Tintas", "12345678922", "tintas@gmail.com", "32323232", "zxcv");
        Aluno aluno1 = alunoService.save(alunoDto1);
        AlunoDto alunoDto2 = new AlunoDto("Vinicius", "12345678988", "vinicius@gmail.com", "32323232", "crvg");
        Aluno aluno2 = alunoService.save(alunoDto2);
        AlunoDto alunoDto3 = new AlunoDto("Cristiano Ronaldo", "12345678977", "cr7@gmail.com", "37737337", "cr7");
        Aluno aluno3 = alunoService.save(alunoDto3);

        instrutor.setAdministrador(administrador);
        instrutor1.setAdministrador(administrador);

        instrutor.getAlunos().add(aluno);
        instrutor.getAlunos().add(aluno1);
        aluno.setInstrutor(instrutor);
        aluno1.setInstrutor(instrutor);

        instrutor1.getAlunos().add(aluno2);
        instrutor1.getAlunos().add(aluno3);
        aluno2.setInstrutor(instrutor1);
        aluno3.setInstrutor(instrutor1);
        instrutorRepository.save(instrutor);
        instrutorRepository.save(instrutor1);
        administradorRepository.save(administrador);
        alunoRepository.save(aluno);
        alunoRepository.save(aluno1);
        alunoRepository.save(aluno2);
        alunoRepository.save(aluno3);

        MatriculaDto matriculaDto = new MatriculaDto("Ativa", "Mensal");
        MatriculaDto matriculaDto1 = new MatriculaDto("Ativa", "Trimestral");


        Matricula matricula = matriculaService.save(matriculaDto);
        matricula.setAluno(aluno);
        matriculaRepository.save(matricula);
        Matricula matricula1 = matriculaService.save(matriculaDto1);
        matricula1.setAluno(aluno1);
        matriculaRepository.save(matricula1);
        Matricula matricula2 = matriculaService.save(matriculaDto1);
        matricula2.setAluno(aluno2);
        matriculaRepository.save(matricula2);
        Matricula matricula3 = matriculaService.save(matriculaDto);
        matricula3.setAluno(aluno3);
        matriculaRepository.save(matricula3);

        ExameFisicoDto exameFisicoDto = new ExameFisicoDto(80, 1.75);
        ExameFisicoDto exameFisicoDto1 = new ExameFisicoDto(75, 1.65);
        ExameFisicoDto exameFisicoDto2 = new ExameFisicoDto(88, 1.83);
        ExameFisicoDto exameFisicoDto3 = new ExameFisicoDto(65, 1.70);

        ExameFisico exameFisico = exameFisicoService.save(exameFisicoDto);
        exameFisico.setAluno(aluno);
        exameFisicoRepository.save(exameFisico);
        ExameFisico exameFisico1 = exameFisicoService.save(exameFisicoDto1);
        exameFisico1.setAluno(aluno1);
        exameFisicoRepository.save(exameFisico1);
        ExameFisico exameFisico2 = exameFisicoService.save(exameFisicoDto2);
        exameFisico2.setAluno(aluno2);
        exameFisicoRepository.save(exameFisico2);
        ExameFisico exameFisico3 = exameFisicoService.save(exameFisicoDto3);
        exameFisico3.setAluno(aluno3);
        exameFisicoRepository.save(exameFisico3);

        FichaDto fichaDto = new FichaDto(true);
        Ficha ficha = fichaService.salvarFicha(fichaDto);
        ficha.setAluno(aluno);
        fichaRepository.save(ficha);
        Ficha ficha1 = fichaService.salvarFicha(fichaDto);
        ficha1.setAluno(aluno1);
        fichaRepository.save(ficha1);
        Ficha ficha2 = fichaService.salvarFicha(fichaDto);
        ficha2.setAluno(aluno2);
        fichaRepository.save(ficha2);
        Ficha ficha3 = fichaService.salvarFicha(fichaDto);
        ficha3.setAluno(aluno3);
        fichaRepository.save(ficha3);

        TreinoDto treinoDto = new TreinoDto("Treino A", "Treino de peitoral,ombro e triceps");
        Treino treino = treinoService.salvarTreino(treinoDto);
        treino.setFicha(ficha);

        ExercicioDto exercicioDto = new ExercicioDto("supino reto barra", 10, "19kg", 4);
        ExercicioDto exercicioDto1 = new ExercicioDto("crucifixo reto", 10, "14kg", 4);
        ExercicioDto exercicioDto2 = new ExercicioDto("voador", 10, "9 placas", 4);
        ExercicioDto exercicioDto3 = new ExercicioDto("desenvolvimento", 10, "14kg", 4);
        ExercicioDto exercicioDto4 = new ExercicioDto("elevação frontal", 10, "8kg", 4);
        ExercicioDto exercicioDto5 = new ExercicioDto("triceps puxador drop set", 10, "9 placas", 4);
        ExercicioDto exercicioDto6 = new ExercicioDto("triceps corda", 10, "9 placas", 4);
        ExercicioDto exercicioDto7 = new ExercicioDto("puxador alto articulado", 10, "40kg", 4);
        ExercicioDto exercicioDto8 = new ExercicioDto("voador invertido", 10, "8 placas", 4);
        ExercicioDto exercicioDto9 = new ExercicioDto("Hiperextensão", 10, "-", 4);
        ExercicioDto exercicioDto10 = new ExercicioDto("rosca direta barra drop set", 10, "9 placas", 4);
        ExercicioDto exercicioDto11 = new ExercicioDto("rosca 21 halter", 21, "8kg", 4);
        ExercicioDto exercicioDto12 = new ExercicioDto("agachamento hack", 10, "20kg", 4);
        ExercicioDto exercicioDto13 = new ExercicioDto("panturrilha hack+panturrilha livre", 10, "25kg, -", 4);
        ExercicioDto exercicioDto14 = new ExercicioDto("cadeira extensora unilateral", 8, "3 placas", 4);
        ExercicioDto exercicioDto15 = new ExercicioDto("cadeira extensora", 10, "6 placas", 4);
        Exercicio exercicio = exercicioService.salvar(exercicioDto);
        Exercicio exercicio1 = exercicioService.salvar(exercicioDto1);
        Exercicio exercicio2 = exercicioService.salvar(exercicioDto2);
        Exercicio exercicio3 = exercicioService.salvar(exercicioDto3);
        Exercicio exercicio4 = exercicioService.salvar(exercicioDto4);
        Exercicio exercicio5 = exercicioService.salvar(exercicioDto5);
        Exercicio exercicio6 = exercicioService.salvar(exercicioDto6);
        Exercicio exercicio7 = exercicioService.salvar(exercicioDto7);
        Exercicio exercicio8 = exercicioService.salvar(exercicioDto8);
        Exercicio exercicio9 = exercicioService.salvar(exercicioDto9);
        Exercicio exercicio10 = exercicioService.salvar(exercicioDto10);
        Exercicio exercicio11 = exercicioService.salvar(exercicioDto11);
        Exercicio exercicio12 = exercicioService.salvar(exercicioDto12);
        Exercicio exercicio13 = exercicioService.salvar(exercicioDto13);
        Exercicio exercicio14 = exercicioService.salvar(exercicioDto14);
        Exercicio exercicio15 = exercicioService.salvar(exercicioDto15);
        treino.getExercicios().addAll(Arrays.asList(exercicio, exercicio1, exercicio2, exercicio3, exercicio4, exercicio5, exercicio6));
        exercicio.setTreino(treino);
        exercicio1.setTreino(treino);
        exercicio2.setTreino(treino);
        exercicio3.setTreino(treino);
        exercicio4.setTreino(treino);
        exercicio5.setTreino(treino);
        exercicio6.setTreino(treino);
        TreinoDto treinoDto1 = new TreinoDto("Treino B", "Treino de costas e biceps");
        Treino treino1 = treinoService.salvarTreino(treinoDto1);
        treino1.setFicha(ficha);
        treino1.getExercicios().addAll(Arrays.asList(exercicio7, exercicio8, exercicio9, exercicio10, exercicio11));
        exercicio7.setTreino(treino1);
        exercicio8.setTreino(treino1);
        exercicio9.setTreino(treino1);
        exercicio10.setTreino(treino1);
        exercicio11.setTreino(treino1);
        TreinoDto treinoDto2 = new TreinoDto("Treino C", "Treino de perna");
        Treino treino2 = treinoService.salvarTreino(treinoDto2);
        treino2.getExercicios().addAll(Arrays.asList(exercicio12, exercicio13, exercicio14, exercicio15));
        treino2.setFicha(ficha);
        exercicio12.setTreino(treino2);
        exercicio13.setTreino(treino2);
        exercicio14.setTreino(treino2);
        exercicio15.setTreino(treino2);
        ficha.getTreinos().addAll(Arrays.asList(treino, treino1, treino2));
        fichaRepository.save(ficha);
        exercicioRepository.saveAll
                (Arrays.asList(exercicio, exercicio1, exercicio2, exercicio3, exercicio4, exercicio5,
                        exercicio6, exercicio7, exercicio8, exercicio9, exercicio10,
                        exercicio11,exercicio12, exercicio13, exercicio14, exercicio15));
        treinoRepository.saveAll(Arrays.asList(treino, treino1, treino2));







    }

}
