package br.com.core.coliseumfitapplication.services.ficha.interfaces;

import br.com.core.coliseumfitapplication.dtos.ficha.ExercicioDto;
import br.com.core.coliseumfitapplication.model.ficha.Exercicio;
import br.com.core.coliseumfitapplication.model.ficha.Treino;

import java.util.List;
import java.util.Optional;

public interface ExercicioService {

    public Exercicio salvar(ExercicioDto exercicioDto);

    public Exercicio findById(Integer Id);

    public List<Exercicio> findAll(Treino treino);

    public void deleteById(Integer Id);

    public void deleteAll(List<ExercicioDto> exerciciosDto);


    public Exercicio updateById(Integer Id, ExercicioDto exercicioDto);

}
