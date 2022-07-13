package br.com.core.coliseumfitapplication.dtos.users;

import br.com.core.coliseumfitapplication.model.users.Pessoa;

import java.util.List;

public class InstrutorDto extends Pessoa {

    private InstrutorDto instrutorDto;
    private List<AlunoDto> alunoDtos;

    public InstrutorDto(InstrutorDto instrutorDto, List<AlunoDto> alunoDtos) {
        this.instrutorDto = instrutorDto;
        this.alunoDtos = alunoDtos;
    }

    public InstrutorDto(String nome, String cpf, String email, String telefone, String senha, InstrutorDto instrutorDto, List<AlunoDto> alunoDtos) {
        super(nome, cpf, email, telefone, senha);
        this.instrutorDto = instrutorDto;
        this.alunoDtos = alunoDtos;
    }

    public InstrutorDto() {
    }

    public InstrutorDto(String nome, String cpf, String email, String telefone, String senha) {
        super(nome, cpf, email, telefone, senha);
    }

    public InstrutorDto getInstrutorDto() {
        return instrutorDto;
    }

    public void setInstrutorDto(InstrutorDto instrutorDto) {
        this.instrutorDto = instrutorDto;
    }

    public List<AlunoDto> getAlunoDtos() {
        return alunoDtos;
    }

    public void setAlunoDtos(List<AlunoDto> alunoDtos) {
        this.alunoDtos = alunoDtos;
    }
}
