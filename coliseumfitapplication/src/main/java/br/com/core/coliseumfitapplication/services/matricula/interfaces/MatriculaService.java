package br.com.core.coliseumfitapplication.services.matricula.interfaces;

import br.com.core.coliseumfitapplication.dtos.matricula.MatriculaDto;
import br.com.core.coliseumfitapplication.model.matricula.Matricula;

import java.util.List;

public interface MatriculaService {

    public Matricula save(MatriculaDto matriculaDto, Integer Id);

    public List<Matricula> findAll();

    public Matricula updateById(Integer Id, MatriculaDto matriculaDto);
}
