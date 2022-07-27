package br.com.core.coliseumfitapplication.services.matricula;

import br.com.core.coliseumfitapplication.dtos.matricula.MatriculaDto;
import br.com.core.coliseumfitapplication.model.matricula.Matricula;
import br.com.core.coliseumfitapplication.model.matricula.Plano;
import br.com.core.coliseumfitapplication.model.matricula.StatusMatricula;
import br.com.core.coliseumfitapplication.model.users.Aluno;
import br.com.core.coliseumfitapplication.repository.matricula.MatriculaRepository;
import br.com.core.coliseumfitapplication.repository.users.AlunoRepository;
import br.com.core.coliseumfitapplication.services.exceptions.ObjectNotFoundException;
import br.com.core.coliseumfitapplication.services.matricula.interfaces.MatriculaService;
import br.com.core.coliseumfitapplication.services.users.interfaces.AlunoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatriculaServiceImpl implements MatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;



    @Autowired
    private ModelMapper modelMapper;



    @Override
    public Matricula save(MatriculaDto matriculaDto) {
        Matricula matricula =new Matricula();
        matricula.setPlano(Plano.valueOf(matriculaDto.getPlano()));
        matricula.setStatus(StatusMatricula.valueOf(matriculaDto.getStatus()));
        return matriculaRepository.save(matricula);
    }

    @Override
    public List<Matricula> findAll() {
        return matriculaRepository.findAll();
    }

    @Override
    public Matricula updateById(Integer Id, MatriculaDto matriculaDto) {
        Optional<Matricula> matriculaOptional = matriculaRepository.findById(Id);
        if(matriculaOptional.isPresent()){
            matriculaOptional.get().setPlano(Plano.valueOf(matriculaDto.getPlano()));
            matriculaOptional.get().setStatus(StatusMatricula.valueOf(matriculaDto.getStatus()));
            return matriculaOptional.get();
        }
        else{
            throw new ObjectNotFoundException("Objeto não encontrado! Id: " + Id + ", Tipo: " + Matricula.class);
        }
    }
}
