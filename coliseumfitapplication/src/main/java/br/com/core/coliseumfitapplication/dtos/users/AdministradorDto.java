package br.com.core.coliseumfitapplication.dtos.users;

import br.com.core.coliseumfitapplication.model.users.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class AdministradorDto extends Pessoa {


    public AdministradorDto() {
    }

    public AdministradorDto(String nome, String cpf, String email, String telefone, String senha) {
        super(nome, cpf, email, telefone, senha);
    }

}
