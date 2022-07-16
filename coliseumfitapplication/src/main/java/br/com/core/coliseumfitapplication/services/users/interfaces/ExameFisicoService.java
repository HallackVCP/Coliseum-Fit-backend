package br.com.core.coliseumfitapplication.services.users.interfaces;

import br.com.core.coliseumfitapplication.dtos.users.info.ExameFisicoDto;
import br.com.core.coliseumfitapplication.model.users.info.ExameFisico;

public interface ExameFisicoService {

    public ExameFisico save(ExameFisicoDto exameFisicoDto);

    public ExameFisico update(Integer Id, ExameFisicoDto exameFisicoDto);
}
