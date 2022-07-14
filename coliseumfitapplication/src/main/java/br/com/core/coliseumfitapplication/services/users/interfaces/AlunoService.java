package br.com.core.coliseumfitapplication.services.users.interfaces;

import br.com.core.coliseumfitapplication.dtos.users.AlunoDto;
import br.com.core.coliseumfitapplication.model.users.Aluno;

public interface AlunoService {

    public Aluno save(AlunoDto alunoDto);
}
