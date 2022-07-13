package br.com.core.coliseumfitapplication.dtos.ficha;

import java.util.List;

public class FichaDto {

    private Integer IdAluno;
    private List<TreinoDto> treinoDtos;

    public FichaDto() {
    }

    public FichaDto(Integer idAluno, List<TreinoDto> treinoDtos) {
        IdAluno = idAluno;
        this.treinoDtos = treinoDtos;
    }

    public Integer getIdAluno() {
        return IdAluno;
    }

    public void setIdAluno(Integer idAluno) {
        IdAluno = idAluno;
    }

    public List<TreinoDto> getTreinoDtos() {
        return treinoDtos;
    }

    public void setTreinoDtos(List<TreinoDto> treinoDtos) {
        this.treinoDtos = treinoDtos;
    }
}
