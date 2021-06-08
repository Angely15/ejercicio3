package com.elecciones.repositories;

import com.elecciones.entities.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatoRepository extends JpaRepository<Candidato, Integer> {
}
