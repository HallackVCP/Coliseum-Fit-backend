package br.com.core.coliseumfitapplication.dtos.users;

import br.com.core.coliseumfitapplication.dtos.ficha.FichaDto;
import br.com.core.coliseumfitapplication.dtos.matricula.MatriculaDto;
import br.com.core.coliseumfitapplication.dtos.users.info.ExameFisicoDto;
import br.com.core.coliseumfitapplication.model.users.Pessoa;

public class AlunoDto extends Pessoa {





    public AlunoDto() {
    }

    public AlunoDto(String nome, String cpf, String email, String telefone, String senha) {
        super(nome, cpf, email, telefone, senha);
    }

    
}
