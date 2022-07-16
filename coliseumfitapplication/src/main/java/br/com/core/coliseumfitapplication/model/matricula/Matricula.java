package br.com.core.coliseumfitapplication.model.matricula;


import br.com.core.coliseumfitapplication.model.users.Aluno;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_matriculas")
public class Matricula implements Serializable {

    @Id
    private Integer Id;

    private StatusMatricula status;
    private Plano plano;

    @OneToOne
    @MapsId
    private Aluno aluno;




    public Matricula() {
    }

    public Matricula(Integer Id, StatusMatricula status, Plano plano) {
        Id = Id;
        this.status = status;
        this.plano = plano;

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

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
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
