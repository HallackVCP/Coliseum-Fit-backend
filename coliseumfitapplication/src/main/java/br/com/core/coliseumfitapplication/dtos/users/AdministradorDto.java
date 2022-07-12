package br.com.core.coliseumfitapplication.dtos.users;

import br.com.core.coliseumfitapplication.model.users.Pessoa;

import java.util.List;

public class AdministradorDto extends Pessoa {

    private List<Integer> IdInstrutores;

    public AdministradorDto() {
    }

    public AdministradorDto(String nome, String cpf, String email, String telefone, String senha) {
        super(nome, cpf, email, telefone, senha);
    }

    public AdministradorDto(List<Integer> idInstrutores) {
        IdInstrutores = idInstrutores;
    }

    public AdministradorDto(String nome, String cpf, String email, String telefone, String senha, List<Integer> idInstrutores) {
        super(nome, cpf, email, telefone, senha);
        IdInstrutores = idInstrutores;
    }

    public List<Integer> getIdInstrutores() {
        return IdInstrutores;
    }

    public void setIdInstrutores(List<Integer> idInstrutores) {
        IdInstrutores = idInstrutores;
    }
}
