package br.com.core.coliseumfitapplication.dtos.ficha;

import java.util.List;

public class FichaDto {

    private List<TreinoDto> treinoDtos;

    public FichaDto() {
    }

    public FichaDto(List<TreinoDto> treinoDtos) {
        this.treinoDtos = treinoDtos;
    }



    public List<TreinoDto> getTreinoDtos() {
        return treinoDtos;
    }

    public void setTreinoDtos(List<TreinoDto> treinoDtos) {
        this.treinoDtos = treinoDtos;
    }
}
