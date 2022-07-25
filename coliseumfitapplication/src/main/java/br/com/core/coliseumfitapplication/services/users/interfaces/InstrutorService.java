package br.com.core.coliseumfitapplication.services.users.interfaces;

import br.com.core.coliseumfitapplication.dtos.users.InstrutorDto;
import br.com.core.coliseumfitapplication.model.users.Instrutor;

import java.util.List;

public interface InstrutorService {

    public List<Instrutor> findAll();

    public Instrutor save(InstrutorDto instrutorDto);

    public Instrutor findByUsernameAndPassword(String email, String senha);
}
