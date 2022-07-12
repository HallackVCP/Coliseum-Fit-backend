package br.com.core.coliseumfitapplication.dtos.ficha;

import java.util.List;

public class FichaDto {

    private Integer IdAluno;
    private List<Integer> IdTreinos;

    public FichaDto() {
    }

    public FichaDto(Integer idAluno, List<Integer> idTreinos) {
        IdAluno = idAluno;
        IdTreinos = idTreinos;
    }

    public Integer getIdAluno() {
        return IdAluno;
    }

    public void setIdAluno(Integer idAluno) {
        IdAluno = idAluno;
    }

    public List<Integer> getIdTreinos() {
        return IdTreinos;
    }

    public void setIdTreinos(List<Integer> idTreinos) {
        IdTreinos = idTreinos;
    }
}
