package br.com.core.coliseumfitapplication.model.users;

import br.com.core.coliseumfitapplication.model.ficha.Ficha;
import br.com.core.coliseumfitapplication.model.ficha.Treino;
import br.com.core.coliseumfitapplication.model.matricula.Matricula;
import br.com.core.coliseumfitapplication.model.users.info.ExameFisico;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Aluno extends Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @OneToOne
    private Matricula matricula;

    @ManyToOne
    @JoinColumn(name = "instrutor_id")

    private Instrutor instrutor;

    @OneToOne
    private ExameFisico exameFisico;

    @OneToOne
    private Ficha ficha;

    public Aluno() {
    }

    public Aluno(Integer id, Matricula matricula, Instrutor instrutor, ExameFisico exameFisico, Ficha ficha) {
        Id = id;
        this.matricula = matricula;
        this.instrutor = instrutor;
        this.exameFisico = exameFisico;
        this.ficha = ficha;
    }

    public Aluno(String nome, String cpf, String email, String telefone, String senha, Integer id, Matricula matricula, Instrutor instrutor, ExameFisico exameFisico, Ficha ficha) {
        super(nome, cpf, email, telefone, senha);
        Id = id;
        this.matricula = matricula;
        this.instrutor = instrutor;
        this.exameFisico = exameFisico;
        this.ficha = ficha;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        Id = Id;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public ExameFisico getExameFisico() {
        return exameFisico;
    }

    public void setExameFisico(ExameFisico exameFisico) {
        this.exameFisico = exameFisico;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aluno aluno = (Aluno) o;

        if (Id != aluno.Id) return false;
        return matricula.equals(aluno.matricula);
    }

    @Override
    public int hashCode() {
        int result = Id;
        result = 31 * result + matricula.hashCode();
        return result;
    }
}
