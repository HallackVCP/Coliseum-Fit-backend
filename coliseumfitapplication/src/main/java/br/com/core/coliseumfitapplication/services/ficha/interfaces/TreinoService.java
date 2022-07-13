package br.com.core.coliseumfitapplication.services.ficha.interfaces;

import br.com.core.coliseumfitapplication.dtos.ficha.TreinoDto;
import br.com.core.coliseumfitapplication.model.ficha.Treino;

import java.util.List;
import java.util.Optional;

public interface TreinoService {

    public Treino salvarTreino(TreinoDto treinoDto);

    public Optional<Treino> findById(Integer Id);

    public List<Treino> findAll();

    public void deleteById(Integer Id);

    public void deleteAll();

    public List<Treino> findAllByNome(String nome);
}
