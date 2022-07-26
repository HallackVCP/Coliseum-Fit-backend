package br.com.core.coliseumfitapplication.dtos.ficha;

public class ExercicioDto {

    private String nome;
    private int repeticoes;
    private String carga;
    private int series;


    public ExercicioDto() {
    }

    public ExercicioDto(String nome, int repeticoes, String carga, int series) {
        this.nome = nome;
        this.repeticoes = repeticoes;
        this.carga = carga;
        this.series=series;

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
}
