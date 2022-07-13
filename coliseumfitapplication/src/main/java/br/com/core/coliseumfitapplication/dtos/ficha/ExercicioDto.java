package br.com.core.coliseumfitapplication.dtos.ficha;

public class ExercicioDto {

    private String nome;
    private int repeticoes;
    private double carga;


    public ExercicioDto() {
    }

    public ExercicioDto(String nome, int repeticoes, double carga) {
        this.nome = nome;
        this.repeticoes = repeticoes;
        this.carga = carga;

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


}
