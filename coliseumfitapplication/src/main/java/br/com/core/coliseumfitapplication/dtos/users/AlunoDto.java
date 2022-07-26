package br.com.core.coliseumfitapplication.dtos.users;

import br.com.core.coliseumfitapplication.dtos.ficha.FichaDto;
import br.com.core.coliseumfitapplication.dtos.matricula.MatriculaDto;
import br.com.core.coliseumfitapplication.dtos.users.info.ExameFisicoDto;
import br.com.core.coliseumfitapplication.model.users.Pessoa;

public class AlunoDto{

    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String senha;



    public AlunoDto() {
    }

    public AlunoDto(String nome, String cpf, String email, String telefone, String senha) {
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
