package com.elecciones.repositories;

import com.elecciones.entities.Votante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VotanteRepository extends JpaRepository<Votante, Integer> {
}
