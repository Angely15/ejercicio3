package com.elecciones.repositories;

import com.elecciones.entities.Tipodocumento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipodocumentoRepository extends JpaRepository<Tipodocumento, Integer> {
}
