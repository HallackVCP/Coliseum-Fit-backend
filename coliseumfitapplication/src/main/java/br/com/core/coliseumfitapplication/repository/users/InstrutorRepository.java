package br.com.core.coliseumfitapplication.repository.users;

import br.com.core.coliseumfitapplication.model.users.Instrutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstrutorRepository extends JpaRepository<Instrutor, Integer> {
}
