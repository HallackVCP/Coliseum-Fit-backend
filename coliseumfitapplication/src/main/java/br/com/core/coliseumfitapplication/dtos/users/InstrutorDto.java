package br.com.core.coliseumfitapplication.dtos.users;

import br.com.core.coliseumfitapplication.model.users.Pessoa;

import javax.validation.constraints.NotNull;
import java.util.List;

public class InstrutorDto extends Pessoa {

    @NotNull(message="{instrutor.admnistrador.nulo}")
    private Integer IdAdministrador;
    @NotNull(message = "{instrutor.alunos.nulo}")
    private List<Integer> IdAlunos;

    public InstrutorDto(Integer idAdministrador, List<Integer> idAlunos) {
        IdAdministrador = idAdministrador;
        IdAlunos = idAlunos;
    }

    public InstrutorDto(String nome, String cpf, String email, String telefone, String senha, Integer idAdministrador, List<Integer> idAlunos) {
        super(nome, cpf, email, telefone, senha);
        IdAdministrador = idAdministrador;
        IdAlunos = idAlunos;
    }

    public InstrutorDto() {
    }

    public InstrutorDto(String nome, String cpf, String email, String telefone, String senha) {
        super(nome, cpf, email, telefone, senha);
    }

    public Integer getIdAdministrador() {
        return IdAdministrador;
    }

    public void setIdAdministrador(Integer idAdministrador) {
        IdAdministrador = idAdministrador;
    }

    public List<Integer> getIdAlunos() {
        return IdAlunos;
    }

    public void setIdAlunos(List<Integer> idAlunos) {
        IdAlunos = idAlunos;
    }
}
