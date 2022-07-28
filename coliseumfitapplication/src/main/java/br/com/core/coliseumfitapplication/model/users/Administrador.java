package br.com.core.coliseumfitapplication.model.users;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_administradores")
public class Administrador extends Pessoa implements Serializable {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;




    @OneToMany
    private List<Instrutor> instrutores;

    public Administrador() {
    }

    public Administrador(Integer id) {
        Id = id;

    }

    public Administrador(String nome, String cpf, String email, String telefone, String senha, Integer id) {
        super(nome, cpf, email, telefone, senha);
        Id = id;

    }

    public Administrador(Integer Id, String nome, String cpf, String email, String telefone, String senha) {
        super(nome, cpf, email, telefone, senha);
        this.Id = Id;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        Id = Id;
    }


    public List<Instrutor> getInstrutores() {
        return instrutores;
    }

    public void setInstrutores(List<Instrutor> instrutores) {
        this.instrutores = instrutores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Administrador that = (Administrador) o;

        return Id == that.Id;
    }

    @Override
    public int hashCode() {
        return Id;
    }
}
