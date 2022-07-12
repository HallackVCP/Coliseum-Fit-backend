package br.com.core.coliseumfitapplication.services.ficha.interfaces;

import br.com.core.coliseumfitapplication.dtos.ficha.TreinoDto;
import br.com.core.coliseumfitapplication.model.ficha.Treino;

public interface TreinoService {

    public Treino salvarTreino(TreinoDto treinoDto);

    public Treino buscarTreinoNomeFicha(String nome, Integer IdFicha);
}
