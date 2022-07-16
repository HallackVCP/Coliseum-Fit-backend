package br.com.core.coliseumfitapplication.dtos.users;

import br.com.core.coliseumfitapplication.model.users.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class InstrutorDto extends Pessoa {


    public InstrutorDto() {
    }

    public InstrutorDto(String nome, String cpf, String email, String telefone, String senha) {
        super(nome, cpf, email, telefone, senha);
    }

}
