package br.com.core.coliseumfitapplication.model.ficha;

import br.com.core.coliseumfitapplication.model.users.Aluno;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
public class Ficha implements Serializable {


    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;




    @OneToMany
    @JsonIgnore
    private List<Treino> treinos;

    public Ficha() {
    }

    public Ficha(Integer Id, List<Treino> treinos) {
        Id = Id;
        this.treinos = treinos;
    }

    public int getId() {
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
