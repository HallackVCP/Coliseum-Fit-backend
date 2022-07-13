package br.com.core.coliseumfitapplication.model.users;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Instrutor extends Pessoa implements Serializable {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @OneToMany
    @JsonIgnore
    private List<Aluno> alunos;

    public Instrutor(Integer Id, List<Aluno> alunos) {
        Id = Id;
        this.alunos = alunos;
    }

    public Instrutor(String nome, String cpf, String email, String telefone, String senha, Integer Id, List<Aluno> alunos) {
        super(nome, cpf, email, telefone, senha);
        Id = Id;
        this.alunos = alunos;
    }

    public Instrutor() {
        
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        Id = Id;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Instrutor instrutor = (Instrutor) o;

        return Id == instrutor.Id;
    }

    @Override
    public int hashCode() {
        return Id;
    }
}
