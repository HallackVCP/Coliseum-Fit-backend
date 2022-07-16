package br.com.core.coliseumfitapplication.repository.users;

import br.com.core.coliseumfitapplication.model.users.Aluno;
import br.com.core.coliseumfitapplication.model.users.Instrutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

    List<Aluno> findAllByInstrutor(Instrutor instrutor);
}
