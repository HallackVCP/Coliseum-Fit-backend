package br.com.core.coliseumfitapplication.services.ficha.interfaces;

import br.com.core.coliseumfitapplication.dtos.ficha.FichaDto;
import br.com.core.coliseumfitapplication.model.ficha.Ficha;

public interface FichaService {

    public Ficha salvarFicha(FichaDto fichaDto);

    public Ficha buscarFicha(Integer IdAluno);

}
