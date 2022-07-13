package br.com.core.coliseumfitapplication.services.ficha;

import br.com.core.coliseumfitapplication.dtos.ficha.TreinoDto;
import br.com.core.coliseumfitapplication.model.ficha.Exercicio;
import br.com.core.coliseumfitapplication.model.ficha.Ficha;
import br.com.core.coliseumfitapplication.model.ficha.Treino;
import br.com.core.coliseumfitapplication.repository.ficha.TreinoRepository;
import br.com.core.coliseumfitapplication.services.exceptions.ObjectNotFoundException;
import br.com.core.coliseumfitapplication.services.ficha.interfaces.TreinoService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
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
    public Treino findById(Integer Id) {
        Optional<Treino> treinoOptional = treinoRepository.findById(Id);
        if(treinoOptional.isPresent()){
            return treinoOptional.get();
        }
        else{
            throw new ObjectNotFoundException("Objeto não encontrado! Id: " + Id + ", Tipo: " + Treino.class);
        }
    }

    @Override
    public List<Treino> findAll() {
        return treinoRepository.findAll();
    }

    @Override
    public void deleteById(Integer Id) {
        treinoRepository.deleteById(Id);
    }

    @Override
    public void deleteAll() {
        treinoRepository.deleteAll();
    }

    @Override
    public List<Treino> findAllByNome(String nome) {
        return treinoRepository.findAllByNome(nome);
    }

    @Override
    public Treino updateById(Integer Id, TreinoDto treinoDto) {
        Optional<Treino> treinoOptional = treinoRepository.findById(Id);
        Treino treino;
        if(treinoOptional.isPresent()){
            treino = treinoOptional.get();
            treino.setDescricao(treinoDto.getDescricao());
            treino.setNome(treinoDto.getNome());
            return treinoRepository.save(treino);
        }
        else{
            throw new ObjectNotFoundException("Objeto não encontrado! Id: " + Id + ", Tipo: " + Treino.class);
        }
    }


}
