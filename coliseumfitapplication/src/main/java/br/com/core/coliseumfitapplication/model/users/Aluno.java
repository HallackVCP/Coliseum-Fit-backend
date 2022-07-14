package br.com.core.coliseumfitapplication.model.users;

import br.com.core.coliseumfitapplication.model.ficha.Ficha;
import br.com.core.coliseumfitapplication.model.ficha.Treino;
import br.com.core.coliseumfitapplication.model.matricula.Matricula;
import br.com.core.coliseumfitapplication.model.users.info.ExameFisico;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Aluno extends Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;


    public Aluno() {
    }

    public Aluno(Integer id) {
        Id = id;
    }

    public Aluno(String nome, String cpf, String email, String telefone, String senha, Integer id) {
        super(nome, cpf, email, telefone, senha);
        Id = id;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        Id = Id;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aluno aluno = (Aluno) o;

        return Id != null ? Id.equals(aluno.Id) : aluno.Id == null;
    }

    @Override
    public int hashCode() {
        return Id != null ? Id.hashCode() : 0;
    }
}
