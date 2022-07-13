package br.com.core.coliseumfitapplication.dtos.ficha;

import java.util.List;

public class TreinoDto {

    private String nome;
    private String descricao;
    private List<ExercicioDto> exercicioDtos;
    private FichaDto fichaDto;

    public TreinoDto() {
    }

    public TreinoDto(String nome, String descricao, List<ExercicioDto> exercicioDtos, FichaDto fichaDto) {
        this.nome = nome;
        this.descricao = descricao;
        this.exercicioDtos = exercicioDtos;
        this.fichaDto = fichaDto;
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

    public List<ExercicioDto> getExercicioDtos() {
        return exercicioDtos;
    }

    public void setExercicioDtos(List<ExercicioDto> exercicioDtos) {
        this.exercicioDtos = exercicioDtos;
    }

    public FichaDto getFichaDto() {
        return fichaDto;
    }

    public void setFichaDto(FichaDto fichaDto) {
        this.fichaDto = fichaDto;
    }
}
