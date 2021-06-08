package com.elecciones.services;

import com.elecciones.entities.Candidato;
import com.elecciones.entities.Eleccion;
import com.elecciones.repositories.EleccionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EleccionService {
    private final EleccionRepository eleccionRepository;

    EleccionService(EleccionRepository eleccionRepository){
        this.eleccionRepository = eleccionRepository;
    }

    public Eleccion create (Eleccion eleccion){
        return eleccionRepository.save(eleccion);
    }

    public Eleccion findOne (Integer id){
        return eleccionRepository.findById(id).get();
    }

    public List<Eleccion> findAll(){
        return  eleccionRepository.findAll();
    }

    public Eleccion update (Eleccion eleccion){
        return eleccionRepository.save(eleccion);
    }

    public void remove (Integer id){
        eleccionRepository.deleteById(id);
    }
}
