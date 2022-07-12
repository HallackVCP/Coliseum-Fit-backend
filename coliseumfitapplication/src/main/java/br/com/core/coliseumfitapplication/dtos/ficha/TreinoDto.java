package br.com.core.coliseumfitapplication.dtos.ficha;

import java.util.List;

public class TreinoDto {

    private String nome;
    private String descricao;
    private List<Integer> IdExercicios;
    private Integer IdFicha;

    public TreinoDto() {
    }

    public TreinoDto(String nome, String descricao, List<Integer> idExercicios, Integer idFicha) {
        this.nome = nome;
        this.descricao = descricao;
        IdExercicios = idExercicios;
        IdFicha = idFicha;
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

    public List<Integer> getIdExercicios() {
        return IdExercicios;
    }

    public void setIdExercicios(List<Integer> idExercicios) {
        IdExercicios = idExercicios;
    }

    public Integer getIdFicha() {
        return IdFicha;
    }

    public void setIdFicha(Integer idFicha) {
        IdFicha = idFicha;
    }
}
