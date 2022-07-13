package br.com.core.coliseumfitapplication.dtos.users;

import br.com.core.coliseumfitapplication.dtos.ficha.FichaDto;
import br.com.core.coliseumfitapplication.dtos.matricula.MatriculaDto;
import br.com.core.coliseumfitapplication.dtos.users.info.ExameFisicoDto;
import br.com.core.coliseumfitapplication.model.users.Pessoa;

public class AlunoDto extends Pessoa {

    private MatriculaDto matriculaDto;
    private FichaDto fichaDto;
    private ExameFisicoDto exameFisicoDto;

    public AlunoDto(MatriculaDto idMatricula, FichaDto fichaDto, ExameFisicoDto exameFisicoDto) {
        matriculaDto = idMatricula;
        this.fichaDto = fichaDto;
        this.exameFisicoDto = exameFisicoDto;
    }

    public AlunoDto(String nome, String cpf, String email, String telefone, String senha, MatriculaDto idMatricula, FichaDto fichaDto, ExameFisicoDto exameFisicoDto) {
        super(nome, cpf, email, telefone, senha);
        matriculaDto = idMatricula;
        this.fichaDto = fichaDto;
        this.exameFisicoDto = exameFisicoDto;
    }

    public AlunoDto() {
    }

    public AlunoDto(String nome, String cpf, String email, String telefone, String senha) {
        super(nome, cpf, email, telefone, senha);
    }

    public MatriculaDto getMatriculaDto() {
        return matriculaDto;
    }

    public void setMatriculaDto(MatriculaDto matriculaDto) {
        this.matriculaDto = matriculaDto;
    }



    public FichaDto getFichaDto() {
        return fichaDto;
    }

    public void setFichaDto(FichaDto fichaDto) {
        this.fichaDto = fichaDto;
    }

    public ExameFisicoDto getExameFisicoDto() {
        return exameFisicoDto;
    }

    public void setExameFisicoDto(ExameFisicoDto exameFisicoDto) {
        this.exameFisicoDto = exameFisicoDto;
    }
}
