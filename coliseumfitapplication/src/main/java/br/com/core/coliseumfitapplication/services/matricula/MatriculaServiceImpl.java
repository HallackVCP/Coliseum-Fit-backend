package br.com.core.coliseumfitapplication.services.matricula;

import br.com.core.coliseumfitapplication.dtos.matricula.MatriculaDto;
import br.com.core.coliseumfitapplication.model.matricula.Matricula;
import br.com.core.coliseumfitapplication.repository.matricula.MatriculaRepository;
import br.com.core.coliseumfitapplication.services.matricula.interfaces.MatriculaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaServiceImpl implements MatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;

    private ModelMapper modelMapper;

    public MatriculaServiceImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public Matricula save(MatriculaDto matriculaDto, Integer Id) {
        Matricula matricula = modelMapper.map(matriculaDto, Matricula.class);
        matricula.setId(Id);
        return matriculaRepository.save(matricula);
    }

    @Override
    public List<Matricula> findAll() {
        return matriculaRepository.findAll();
    }
}
