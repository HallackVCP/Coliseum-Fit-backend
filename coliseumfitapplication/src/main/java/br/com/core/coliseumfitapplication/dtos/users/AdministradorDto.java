package br.com.core.coliseumfitapplication.dtos.users;

import br.com.core.coliseumfitapplication.model.users.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class AdministradorDto extends Pessoa {

    private List<InstrutorDto> instrutorDtos = new ArrayList<>();

    public AdministradorDto() {
    }

    public AdministradorDto(String nome, String cpf, String email, String telefone, String senha) {
        super(nome, cpf, email, telefone, senha);
    }


    public List<InstrutorDto> getInstrutorDtos() {
        return instrutorDtos;
    }

    public void setInstrutorDtos(List<InstrutorDto> instrutorDtos) {
        this.instrutorDtos = instrutorDtos;
    }
}
