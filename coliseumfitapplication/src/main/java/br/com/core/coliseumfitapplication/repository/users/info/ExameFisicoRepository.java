package br.com.core.coliseumfitapplication.repository.users.info;

import br.com.core.coliseumfitapplication.model.users.info.ExameFisico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExameFisicoRepository extends JpaRepository<ExameFisico, Integer> {
}
