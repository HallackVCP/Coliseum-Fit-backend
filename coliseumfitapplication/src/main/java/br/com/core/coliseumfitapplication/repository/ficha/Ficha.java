package br.com.core.coliseumfitapplication.repository.ficha;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ficha extends JpaRepository<Ficha, Integer> {
}
