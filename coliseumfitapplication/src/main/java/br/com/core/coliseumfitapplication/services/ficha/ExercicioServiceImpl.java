package br.com.core.coliseumfitapplication.services.ficha;

import br.com.core.coliseumfitapplication.dtos.ficha.ExercicioDto;
import br.com.core.coliseumfitapplication.model.ficha.Exercicio;
import br.com.core.coliseumfitapplication.repository.ficha.ExercicioRepository;
import br.com.core.coliseumfitapplication.services.exceptions.ObjectNotFoundException;
import br.com.core.coliseumfitapplication.services.ficha.interfaces.ExercicioService;

import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.Optional;

public class ExercicioServiceImpl implements ExercicioService {

    private final ExercicioRepository exercicioRepository;

    private final ModelMapper modelMapper;

    public ExercicioServiceImpl(ExercicioRepository exercicioRepository, ModelMapper modelMapper) {
        this.exercicioRepository = exercicioRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Exercicio salvar(ExercicioDto exercicioDto) {
        return exercicioRepository.save(modelMapper.map(exercicioDto, Exercicio.class));
    }

    @Override
    public Optional<Exercicio> findById(Integer Id) {
        return exercicioRepository.findById(Id);
    }

    @Override
    public List<Exercicio> findAll() {
        return exercicioRepository.findAll();
    }

    @Override
    public void deleteById(Integer Id) {
        exercicioRepository.deleteById(Id);
    }

    @Override
    public void deleteAll() {
        exercicioRepository.deleteAll();
    }

    @Override
    public List<Exercicio> findAllByNome(String nome) {
        return exercicioRepository.findAllByNome(nome);
    }

    @Override
    public Exercicio updateById(Integer Id, ExercicioDto exercicioDto) {
        Optional<Exercicio> exercicioOptional = exercicioRepository.findById(Id);
        Exercicio exercicio;
        if(exercicioOptional.isPresent()){
                exercicio = exercicioOptional.get();
                exercicio.setCarga(exercicioDto.getCarga());
                exercicio.setNome(exercicioDto.getNome());
                exercicio.setRepeticoes(exercicioDto.getRepeticoes());
                return exercicioRepository.save(exercicio);
        }
        else{
            throw new ObjectNotFoundException("Objeto não encontrado! Id: " + Id + ", Tipo: " + Exercicio.class);
        }
    }
}
