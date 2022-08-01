package br.com.core.coliseumfitapplication.services.ficha;

import br.com.core.coliseumfitapplication.dtos.ficha.FichaDto;
import br.com.core.coliseumfitapplication.model.ficha.Ficha;
import br.com.core.coliseumfitapplication.model.ficha.Treino;
import br.com.core.coliseumfitapplication.model.users.Aluno;
import br.com.core.coliseumfitapplication.repository.ficha.FichaRepository;
import br.com.core.coliseumfitapplication.services.exceptions.ObjectNotFoundException;
import br.com.core.coliseumfitapplication.services.ficha.interfaces.FichaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import java.util.Optional;

@Service
public class FichaServiceImpl implements FichaService {

    @Autowired
    private FichaRepository fichaRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public Ficha salvarFicha(FichaDto fichaDto) {
        Ficha saveFicha = modelMapper.map(fichaDto, Ficha.class);
        return fichaRepository.save(saveFicha);
    }

    @Override
    public Ficha buscarFicha(Integer Id) {
        Optional<Ficha> fichaOptional = fichaRepository.findById(Id);
        if(fichaOptional.isPresent()){
            return fichaOptional.get();
        }
        else{
            throw new ObjectNotFoundException("Objeto não encontrado! Id: " + Id + ", Tipo: " + Ficha.class);
        }
    }

    @Override
    public Ficha update(Integer Id, FichaDto fichaDto) {
        Optional<Ficha> fichaOptional = fichaRepository.findById(Id);
        if(fichaOptional.isPresent()){
            Ficha ficha = fichaOptional.get();
            ficha.setAlterarFicha(fichaDto.isAlterarFicha());
            fichaRepository.save(ficha);
            return ficha;
        }
        else{
            throw new ObjectNotFoundException("Objeto não encontrado! Id: " + Id + ", Tipo: " + Ficha.class);
        }
    }


}
