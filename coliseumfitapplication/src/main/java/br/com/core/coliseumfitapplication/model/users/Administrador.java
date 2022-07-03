package br.com.core.coliseumfitapplication.model.users;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Administrador extends Pessoa implements Serializable {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private boolean isAdmin = true;


    @OneToMany
    @JsonIgnore
    private List<Instrutor> instrutores;

    public Administrador() {
    }

    public Administrador(Integer id, boolean isAdmin, List<Instrutor> instrutores) {
        Id = id;
        this.isAdmin = isAdmin;
        this.instrutores = instrutores;
    }

    public Administrador(String nome, String cpf, String email, String telefone, String senha, Integer id, boolean isAdmin, List<Instrutor> instrutores) {
        super(nome, cpf, email, telefone, senha);
        Id = id;
        this.isAdmin = isAdmin;
        this.instrutores = instrutores;
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

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
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
