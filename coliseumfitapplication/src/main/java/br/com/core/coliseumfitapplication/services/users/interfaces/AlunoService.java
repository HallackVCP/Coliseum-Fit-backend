package br.com.core.coliseumfitapplication.services.users.interfaces;

import br.com.core.coliseumfitapplication.dtos.users.AlunoDto;
import br.com.core.coliseumfitapplication.model.users.Aluno;
import br.com.core.coliseumfitapplication.model.users.Instrutor;

import java.util.List;

public interface AlunoService {

    public Aluno save(AlunoDto alunoDto);

    public List<Aluno> findAll(Instrutor instrutor);
}
