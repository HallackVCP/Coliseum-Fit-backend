package br.com.core.coliseumfitapplication.model.ficha;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Exercicio implements Serializable {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String nome;

    private int repeticoes;

    private double carga;

    private int series;



    public Exercicio() {
    }

    public Exercicio(Integer Id, String nome, int repeticoes, double carga, int series) {
        this.Id = Id;
        this.nome = nome;
        this.repeticoes = repeticoes;
        this.carga = carga;
        this.series=series;
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

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
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
