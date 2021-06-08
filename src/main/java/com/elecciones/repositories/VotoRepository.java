package com.elecciones.repositories;

import com.elecciones.entities.Voto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VotoRepository extends JpaRepository<Voto, Integer> {
    Optional<Voto> findByUuid(String uuid);
}
