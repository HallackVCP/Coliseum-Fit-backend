package br.com.core.coliseumfitapplication.repository.ficha;

import br.com.core.coliseumfitapplication.model.ficha.Exercicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExercicioRepository extends JpaRepository<Exercicio, Integer> {

    List<Exercicio> findAllByNome(String nome);
}
