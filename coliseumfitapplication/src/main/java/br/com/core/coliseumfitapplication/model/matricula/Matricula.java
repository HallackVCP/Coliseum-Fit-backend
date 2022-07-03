package br.com.core.coliseumfitapplication.model.matricula;


import br.com.core.coliseumfitapplication.model.users.Aluno;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Matricula implements Serializable {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private StatusMatricula status;
    private Plano plano;


    @OneToOne
    private Aluno aluno;

    public Matricula() {
    }

    public Matricula(Integer Id, StatusMatricula status, Plano plano, Aluno aluno) {
        Id = Id;
        this.status = status;
        this.plano = plano;
        this.aluno = aluno;
    }

    public StatusMatricula getStatus() {
        return status;
    }

    public void setStatus(StatusMatricula status) {
        this.status = status;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public int getId() {
        return Id;
    }

    public void setId(Integer Id) {
        Id = Id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Matricula matricula = (Matricula) o;

        return Id == matricula.Id;
    }

    @Override
    public int hashCode() {
        return Id;
    }
}
