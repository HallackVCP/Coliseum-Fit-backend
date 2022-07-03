package br.com.core.coliseumfitapplication.repository.users;

import br.com.core.coliseumfitapplication.model.users.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
}
