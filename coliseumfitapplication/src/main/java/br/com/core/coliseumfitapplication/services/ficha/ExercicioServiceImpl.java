package br.com.core.coliseumfitapplication.services.ficha;

import br.com.core.coliseumfitapplication.dtos.ficha.ExercicioDto;
import br.com.core.coliseumfitapplication.model.ficha.Exercicio;
import br.com.core.coliseumfitapplication.model.ficha.Ficha;
import br.com.core.coliseumfitapplication.repository.ficha.ExercicioRepository;
import br.com.core.coliseumfitapplication.services.exceptions.ObjectNotFoundException;
import br.com.core.coliseumfitapplication.services.ficha.interfaces.ExercicioService;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
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
    public Exercicio findById(Integer Id) {
        Optional<Exercicio> exercicioOptional = exercicioRepository.findById(Id);
        if(exercicioOptional.isPresent()){
            return exercicioOptional.get();
        }
        else{
            throw new ObjectNotFoundException("Objeto não encontrado! Id: " + Id + ", Tipo: " + Exercicio.class);
        }
    }

    @Override
    public List<Exercicio> findAll(Integer treinoId) {
        return null;
        //return exercicioRepository.findAllByTreinoId(treinoId);
    }

    @Override
    public void deleteById(Integer Id) {
        exercicioRepository.deleteById(Id);
    }

    @Override
    public void deleteAll(List<ExercicioDto> exerciciosDto) {
        List<Exercicio> exercicios = modelMapper.map(exerciciosDto, new TypeToken<List<Exercicio>>(){}.getType());
        exercicioRepository.deleteAll(exercicios);
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
