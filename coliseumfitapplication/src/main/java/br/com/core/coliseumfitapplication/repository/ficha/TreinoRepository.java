package br.com.core.coliseumfitapplication.repository.ficha;
import br.com.core.coliseumfitapplication.model.ficha.Ficha;
import br.com.core.coliseumfitapplication.model.ficha.Treino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TreinoRepository extends JpaRepository<Treino, Integer> {
    List<Treino> findAllByNome(String nome);
    List<Treino> findAllByFicha(Ficha ficha);
}
