package br.com.core.coliseumfitapplication.model.ficha;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_exercicios")
public class Exercicio implements Serializable {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String nome;

    private int repeticoes;

    private String carga;

    private int series;

    @ManyToOne
    @JoinColumn(name = "treino_id")
    @JsonIgnore
    private Treino treino;



    public Exercicio() {
    }

    public Exercicio(Integer Id, String nome, int repeticoes, String carga, int series) {
        this.Id = Id;
        this.nome = nome;
        this.repeticoes = repeticoes;
        this.carga = carga;
        this.series=series;
    }

    public Integer getId() {
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

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public Treino getTreino() {
        return treino;
    }

    public void setTreino(Treino treino) {
        this.treino = treino;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Exercicio exercicio = (Exercicio) o;

        return Id == exercicio.Id;
    }

    @Override
    public int hashCode() {
        return Id;
    }
}
