package br.com.core.coliseumfitapplication.repository.ficha;

import br.com.core.coliseumfitapplication.model.ficha.Ficha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FichaRepository extends JpaRepository<Ficha, Integer> {
}
