package br.com.core.coliseumfitapplication.dtos.users;

import br.com.core.coliseumfitapplication.model.users.Pessoa;

public class AlunoDto extends Pessoa {

    private Integer IdMatricula;
    private Integer IdInstrutor;
    private Integer IdFicha;
    private Integer IdExameFisico;

    public AlunoDto(Integer idMatricula, Integer idInstrutor, Integer idFicha, Integer idExameFisico) {
        IdMatricula = idMatricula;
        IdInstrutor = idInstrutor;
        IdFicha = idFicha;
        IdExameFisico = idExameFisico;
    }

    public AlunoDto(String nome, String cpf, String email, String telefone, String senha, Integer idMatricula, Integer idInstrutor, Integer idFicha, Integer idExameFisico) {
        super(nome, cpf, email, telefone, senha);
        IdMatricula = idMatricula;
        IdInstrutor = idInstrutor;
        IdFicha = idFicha;
        IdExameFisico = idExameFisico;
    }

    public AlunoDto() {
    }

    public AlunoDto(String nome, String cpf, String email, String telefone, String senha) {
        super(nome, cpf, email, telefone, senha);
    }

    public Integer getIdMatricula() {
        return IdMatricula;
    }

    public void setIdMatricula(Integer idMatricula) {
        IdMatricula = idMatricula;
    }

    public Integer getIdInstrutor() {
        return IdInstrutor;
    }

    public void setIdInstrutor(Integer idInstrutor) {
        IdInstrutor = idInstrutor;
    }

    public Integer getIdFicha() {
        return IdFicha;
    }

    public void setIdFicha(Integer idFicha) {
        IdFicha = idFicha;
    }

    public Integer getIdExameFisico() {
        return IdExameFisico;
    }

    public void setIdExameFisico(Integer idExameFisico) {
        IdExameFisico = idExameFisico;
    }
}
