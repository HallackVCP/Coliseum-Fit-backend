package br.com.core.coliseumfitapplication.services.ficha.interfaces;

import br.com.core.coliseumfitapplication.dtos.ficha.FichaDto;
import br.com.core.coliseumfitapplication.model.ficha.Ficha;
import br.com.core.coliseumfitapplication.model.users.Aluno;

import java.util.Optional;

public interface FichaService {

    public Ficha salvarFicha(FichaDto fichaDto);

    public Ficha buscarFicha(Integer Id);

    public FichaDto update(Integer Id, FichaDto fichaDto);



}
