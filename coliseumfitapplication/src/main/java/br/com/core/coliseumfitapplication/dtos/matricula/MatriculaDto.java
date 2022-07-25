package br.com.core.coliseumfitapplication.dtos.matricula;

import br.com.core.coliseumfitapplication.dtos.users.AlunoDto;
import br.com.core.coliseumfitapplication.model.matricula.Plano;
import br.com.core.coliseumfitapplication.model.matricula.StatusMatricula;

public class MatriculaDto {


    private String status;
    private String plano;



    public MatriculaDto() {
    }

    public MatriculaDto(String status, String plano) {
        this.status = status;
        this.plano = plano;
    }





    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

}
