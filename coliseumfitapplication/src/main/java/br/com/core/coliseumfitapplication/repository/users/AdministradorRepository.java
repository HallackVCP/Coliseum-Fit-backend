package br.com.core.coliseumfitapplication.repository.users;

import br.com.core.coliseumfitapplication.model.users.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministradorRepository extends JpaRepository<Administrador, Integer> {
}
