package br.com.core.coliseumfitapplication.dtos.users;

import br.com.core.coliseumfitapplication.model.users.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class InstrutorDto {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String senha;


    public InstrutorDto() {
    }

    public InstrutorDto(String nome, String cpf, String email, String telefone, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
