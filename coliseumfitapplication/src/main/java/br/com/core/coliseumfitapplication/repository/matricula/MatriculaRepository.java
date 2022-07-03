package br.com.core.coliseumfitapplication.repository.matricula;

import br.com.core.coliseumfitapplication.model.matricula.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Integer> {
}
