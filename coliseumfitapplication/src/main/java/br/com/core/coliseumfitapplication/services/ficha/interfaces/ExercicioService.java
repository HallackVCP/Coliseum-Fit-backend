package br.com.core.coliseumfitapplication.services.ficha.interfaces;

import br.com.core.coliseumfitapplication.dtos.ficha.ExercicioDto;
import br.com.core.coliseumfitapplication.model.ficha.Exercicio;

import java.util.List;
import java.util.Optional;

public interface ExercicioService {

    public Exercicio salvar(ExercicioDto exercicioDto);

    public Optional<Exercicio> findById(Integer Id);

    public List<Exercicio> findAll();

    public void deleteById(Integer Id);

    public void deleteAll();

    public List<Exercicio> findAllByNome(String nome);

    public Exercicio updateById(Integer Id, ExercicioDto exercicioDto);

}
