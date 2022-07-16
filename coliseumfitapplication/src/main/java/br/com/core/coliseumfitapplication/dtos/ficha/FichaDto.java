package br.com.core.coliseumfitapplication.dtos.ficha;

import java.util.ArrayList;
import java.util.List;

public class FichaDto {


    private boolean alterarFicha;



    public FichaDto() {
    }

    public FichaDto(boolean alterarFicha) {
        this.alterarFicha = alterarFicha;
    }


    public boolean isAlterarFicha() {
        return alterarFicha;
    }

    public void setAlterarFicha(boolean alterarFicha) {
        this.alterarFicha = alterarFicha;
    }
}
