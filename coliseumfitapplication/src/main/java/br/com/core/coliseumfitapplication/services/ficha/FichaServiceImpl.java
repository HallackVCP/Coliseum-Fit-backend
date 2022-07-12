package br.com.core.coliseumfitapplication.services.ficha;

import br.com.core.coliseumfitapplication.dtos.ficha.FichaDto;
import br.com.core.coliseumfitapplication.model.ficha.Ficha;
import br.com.core.coliseumfitapplication.repository.ficha.FichaRepository;
import br.com.core.coliseumfitapplication.services.ficha.interfaces.FichaService;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

@Service
public class FichaServiceImpl implements FichaService {

    private final FichaRepository fichaRepository;

    private final ModelMapper modelMapper;

    public FichaServiceImpl(FichaRepository fichaRepository, ModelMapper modelMapper) {
        this.fichaRepository = fichaRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Ficha salvarFicha(FichaDto fichaDto) {
        return fichaRepository.save(modelMapper.map(fichaDto, Ficha.class));
    }

    @Override
    public Ficha buscarFicha(Integer IdAluno) {
        return null;
    }
}
