package com.elecciones.repositories;

import com.elecciones.entities.Estamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstamentoRepository extends JpaRepository<Estamento, Integer> {
}
