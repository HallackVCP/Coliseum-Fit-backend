package br.com.core.coliseumfitapplication.dtos.ficha;

import java.util.ArrayList;
import java.util.List;

public class TreinoDto {

    private String nome;
    private String descricao;



    public TreinoDto() {
    }

    public TreinoDto(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
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


}
