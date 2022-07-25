package br.com.core.coliseumfitapplication.services.users.interfaces;

import br.com.core.coliseumfitapplication.dtos.users.AdministradorDto;
import br.com.core.coliseumfitapplication.model.users.Administrador;

public interface AdministradorService {

    public Administrador save(AdministradorDto administradorDto);
    public Administrador findByUsernameAndPassword(String email, String senha);
}
