package com.elecciones.repositories;

import com.elecciones.entities.Eleccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EleccionRepository extends JpaRepository<Eleccion, Integer> {
}
