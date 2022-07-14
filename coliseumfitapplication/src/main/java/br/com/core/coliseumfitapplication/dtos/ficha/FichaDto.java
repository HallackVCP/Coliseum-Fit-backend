package br.com.core.coliseumfitapplication.dtos.ficha;

import java.util.ArrayList;
import java.util.List;

public class FichaDto {

    private List<TreinoDto> treinoDtos = new ArrayList<>();

    private boolean alterarFicha;



    public FichaDto() {
    }

    public FichaDto(boolean alterarFicha) {
        this.alterarFicha = alterarFicha;
    }

    public List<TreinoDto> getTreinoDtos() {
        return treinoDtos;
    }

    public void setTreinoDtos(List<TreinoDto> treinoDtos) {
        this.treinoDtos = treinoDtos;
    }

    public boolean isAlterarFicha() {
        return alterarFicha;
    }

    public void setAlterarFicha(boolean alterarFicha) {
        this.alterarFicha = alterarFicha;
    }
}
