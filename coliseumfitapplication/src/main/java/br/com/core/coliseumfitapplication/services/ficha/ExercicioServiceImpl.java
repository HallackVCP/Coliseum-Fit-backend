package br.com.core.coliseumfitapplication.services.ficha;

import br.com.core.coliseumfitapplication.dtos.ficha.ExercicioDto;
import br.com.core.coliseumfitapplication.model.ficha.Exercicio;
import br.com.core.coliseumfitapplication.model.ficha.Ficha;
import br.com.core.coliseumfitapplication.model.ficha.Treino;
import br.com.core.coliseumfitapplication.repository.ficha.ExercicioRepository;
import br.com.core.coliseumfitapplication.services.exceptions.ObjectNotFoundException;
import br.com.core.coliseumfitapplication.services.ficha.interfaces.ExercicioService;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExercicioServiceImpl implements ExercicioService {

    @Autowired
    private ExercicioRepository exercicioRepository;

    @Autowired
    private ModelMapper modelMapper;




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
    public List<Exercicio> findAll(Treino treino) {
        return exercicioRepository.findAllByTreinoId(treino);
    }

    @Override
    public void deleteById(Integer Id) {
        exercicioRepository.deleteById(Id);
    }

    @Override
    public void deleteAll(List<Exercicio> exercicios) {
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
