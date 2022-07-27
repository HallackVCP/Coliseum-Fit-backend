package br.com.core.coliseumfitapplication.services.users;

import br.com.core.coliseumfitapplication.dtos.users.info.ExameFisicoDto;
import br.com.core.coliseumfitapplication.model.users.Aluno;
import br.com.core.coliseumfitapplication.model.users.info.ExameFisico;
import br.com.core.coliseumfitapplication.repository.users.info.ExameFisicoRepository;
import br.com.core.coliseumfitapplication.services.exceptions.ObjectNotFoundException;
import br.com.core.coliseumfitapplication.services.users.interfaces.ExameFisicoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExameFisicoServiceImpl implements ExameFisicoService {
    @Autowired
    private ExameFisicoRepository exameFisicoRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ExameFisico save(ExameFisicoDto exameFisicoDto) {
        ExameFisico save = modelMapper.map(exameFisicoDto, ExameFisico.class);
        return exameFisicoRepository.save(save);
    }

    @Override
    public ExameFisico update(Integer Id, ExameFisicoDto exameFisicoDto) {
        Optional<ExameFisico> exameFisicoOptional = exameFisicoRepository.findById(Id);
        if(exameFisicoOptional.isPresent()){
            ExameFisico exameFisico = exameFisicoOptional.get();
            exameFisico.setAltura(exameFisicoDto.getAltura());
            exameFisico.setPeso(exameFisicoDto.getPeso());
            return exameFisicoRepository.save(exameFisico);
        }
        else{
            throw new
                    ObjectNotFoundException("Objeto não encontrado! Id: " + Id + ", Tipo: " + ExameFisico.class);
        }
    }
}
