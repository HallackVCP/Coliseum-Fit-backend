package br.com.core.coliseumfitapplication.services.users;

import br.com.core.coliseumfitapplication.model.users.Instrutor;
import br.com.core.coliseumfitapplication.repository.users.InstrutorRepository;
import br.com.core.coliseumfitapplication.services.users.interfaces.InstrutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstrutorServiceImpl implements InstrutorService {

    @Autowired
    InstrutorRepository instrutorRepository;
    @Override
    public List<Instrutor> findAll() {
        return instrutorRepository.findAll();
    }
}
