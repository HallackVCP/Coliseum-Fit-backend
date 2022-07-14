package br.com.core.coliseumfitapplication.model.ficha;

import br.com.core.coliseumfitapplication.model.users.Aluno;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Ficha implements Serializable {


    @javax.persistence.Id
    private Integer Id;


    @OneToOne
    @MapsId
    private Aluno aluno;

    @OneToMany
    private List<Treino> treinos = new ArrayList<>();

    private boolean isAlterarFicha;

    public Ficha() {
    }

    public Ficha(Integer Id, boolean isAlterarFicha) {
        this.Id = Id;
        this.isAlterarFicha = isAlterarFicha;

    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        Id = Id;
    }


    public List<Treino> getTreinos() {
        return treinos;
    }

    public void setTreinos(List<Treino> treinos) {
        this.treinos = treinos;
    }

    public boolean isAlterarFicha() {
        return isAlterarFicha;
    }

    public void setAlterarFicha(boolean alterarFicha) {
        isAlterarFicha = alterarFicha;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ficha ficha = (Ficha) o;

        return Id == ficha.Id;
    }

    @Override
    public int hashCode() {
        return Id;
    }
}
