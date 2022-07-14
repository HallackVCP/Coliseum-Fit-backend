package br.com.core.coliseumfitapplication.model.ficha;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Treino implements Serializable {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String nome;

    private String descricao;


    @OneToMany
    @JsonIgnore
    private List<Exercicio> exercicios = new ArrayList<>();



    public Treino() {
    }

    public Treino(Integer id, String nome, String descricao) {
        Id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getId() {
        return Id;
    }

    public void setId(Integer Id) {
        Id = Id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Exercicio> getExercicios() {
        return exercicios;
    }

    public void setExercicios(List<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Treino treino = (Treino) o;

        return Id == treino.Id;
    }

    @Override
    public int hashCode() {
        return Id;
    }
}
