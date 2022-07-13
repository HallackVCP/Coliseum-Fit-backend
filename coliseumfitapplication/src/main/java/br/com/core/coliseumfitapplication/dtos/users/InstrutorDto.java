package br.com.core.coliseumfitapplication.dtos.users;

import br.com.core.coliseumfitapplication.model.users.Pessoa;

import java.util.List;

public class InstrutorDto extends Pessoa {


    private List<AlunoDto> alunoDtos;

    public InstrutorDto(List<AlunoDto> alunoDtos) {
        this.alunoDtos = alunoDtos;
    }

    public InstrutorDto(String nome, String cpf, String email, String telefone, String senha, List<AlunoDto> alunoDtos) {
        super(nome, cpf, email, telefone, senha);
        this.alunoDtos = alunoDtos;
    }

    public InstrutorDto() {
    }

    public InstrutorDto(String nome, String cpf, String email, String telefone, String senha) {
        super(nome, cpf, email, telefone, senha);
    }


    public List<AlunoDto> getAlunoDtos() {
        return alunoDtos;
    }

    public void setAlunoDtos(List<AlunoDto> alunoDtos) {
        this.alunoDtos = alunoDtos;
    }
}
