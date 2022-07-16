package br.com.core.coliseumfitapplication.services.users;

import br.com.core.coliseumfitapplication.dtos.users.AlunoDto;
import br.com.core.coliseumfitapplication.model.users.Aluno;
import br.com.core.coliseumfitapplication.model.users.Instrutor;
import br.com.core.coliseumfitapplication.repository.users.AlunoRepository;
import br.com.core.coliseumfitapplication.services.users.interfaces.AlunoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    private final ModelMapper modelMapper;

    public AlunoServiceImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public Aluno save(AlunoDto alunoDto) {
        return alunoRepository.save(modelMapper.map(alunoDto, Aluno.class));
    }

    @Override
    public List<Aluno> findAll(Instrutor instrutor) {
        return alunoRepository.findAllByInstrutor(instrutor);
    }
}
