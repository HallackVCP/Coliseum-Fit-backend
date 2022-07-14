package br.com.core.coliseumfitapplication.dtos.matricula;

import br.com.core.coliseumfitapplication.dtos.users.AlunoDto;
import br.com.core.coliseumfitapplication.model.matricula.Plano;
import br.com.core.coliseumfitapplication.model.matricula.StatusMatricula;

public class MatriculaDto {

    private Integer Id;

    private StatusMatricula status;
    private Plano plano;
    private AlunoDto alunoDto;


    public MatriculaDto() {
    }

    public MatriculaDto(Integer id, StatusMatricula status, Plano plano) {
        Id = id;
        this.status = status;
        this.plano = plano;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
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

    public AlunoDto getAlunoDto() {
        return alunoDto;
    }

    public void setAlunoDto(AlunoDto alunoDto) {
        this.alunoDto = alunoDto;
    }
}
