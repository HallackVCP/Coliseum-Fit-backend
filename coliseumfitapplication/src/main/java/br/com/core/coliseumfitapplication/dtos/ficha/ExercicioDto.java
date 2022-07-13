package br.com.core.coliseumfitapplication.dtos.ficha;

public class ExercicioDto {

    private String nome;
    private int repeticoes;
    private double carga;
    private TreinoDto treinoDto;

    public ExercicioDto() {
    }

    public ExercicioDto(String nome, int repeticoes, double carga, TreinoDto treinoDto) {
        this.nome = nome;
        this.repeticoes = repeticoes;
        this.carga = carga;
        this.treinoDto = treinoDto;
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

    public TreinoDto getTreinoDto() {
        return treinoDto;
    }

    public void setTreinoDto(TreinoDto treinoDto) {
        this.treinoDto = treinoDto;
    }
}
