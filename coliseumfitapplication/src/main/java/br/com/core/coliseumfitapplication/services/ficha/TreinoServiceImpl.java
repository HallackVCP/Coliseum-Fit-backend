package br.com.core.coliseumfitapplication.services.ficha;

import br.com.core.coliseumfitapplication.dtos.ficha.TreinoDto;
import br.com.core.coliseumfitapplication.model.ficha.Treino;
import br.com.core.coliseumfitapplication.repository.ficha.TreinoRepository;
import br.com.core.coliseumfitapplication.services.ficha.interfaces.TreinoService;
import org.modelmapper.ModelMapper;

public class TreinoServiceImpl implements TreinoService {

    private final TreinoRepository treinoRepository;

    private final ModelMapper modelMapper;

    public TreinoServiceImpl(TreinoRepository treinoRepository, ModelMapper modelMapper) {
        this.treinoRepository = treinoRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Treino salvarTreino(TreinoDto treinoDto) {
        return treinoRepository.save(modelMapper.map(treinoDto, Treino.class));
    }

    @Override
    public Treino buscarTreinoNomeFicha(String nome, Integer IdFicha) {
        return null;
    }
}
