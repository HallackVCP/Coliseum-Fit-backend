package br.com.core.coliseumfitapplication.dtos.ficha;

public class ExercicioDto {

    private String nome;
    private int repeticoes;
    private double carga;
    private Integer IdTreino;

    public ExercicioDto() {
    }

    public ExercicioDto(String nome, int repeticoes, double carga, Integer idTreino) {
        this.nome = nome;
        this.repeticoes = repeticoes;
        this.carga = carga;
        IdTreino = idTreino;
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

    public Integer getIdTreino() {
        return IdTreino;
    }

    public void setIdTreino(Integer idTreino) {
        IdTreino = idTreino;
    }
}
