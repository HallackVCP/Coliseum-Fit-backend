package br.com.core.coliseumfitapplication.repository.ficha;

import br.com.core.coliseumfitapplication.model.ficha.Exercicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExercicioRepository extends JpaRepository<Exercicio, Integer> {
}
