package br.com.core.coliseumfitapplication.dtos.ficha;

import java.util.ArrayList;
import java.util.List;

public class FichaDto {

    private List<TreinoDto> treinoDtos = new ArrayList<>();

    public FichaDto() {
    }


    public List<TreinoDto> getTreinoDtos() {
        return treinoDtos;
    }

    public void setTreinoDtos(List<TreinoDto> treinoDtos) {
        this.treinoDtos = treinoDtos;
    }
}
