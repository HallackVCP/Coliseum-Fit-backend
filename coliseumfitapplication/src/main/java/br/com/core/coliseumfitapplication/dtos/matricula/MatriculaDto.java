package br.com.core.coliseumfitapplication.dtos.matricula;

import br.com.core.coliseumfitapplication.dtos.users.AlunoDto;
import br.com.core.coliseumfitapplication.model.matricula.Plano;
import br.com.core.coliseumfitapplication.model.matricula.StatusMatricula;

public class MatriculaDto {


    private StatusMatricula status;
    private Plano plano;



    public MatriculaDto() {
    }

    public MatriculaDto(StatusMatricula status, Plano plano) {
        this.status = status;
        this.plano = plano;
    }

    public MatriculaDto(String status, String plano){
        this.status = StatusMatricula.valueOf(status);
        this.plano = Plano.valueOf(plano);
    }



    public StatusMatricula getStatus() {
        return status;
    }

    public void setStatus(StatusMatricula status) {
        this.status = status;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

}
