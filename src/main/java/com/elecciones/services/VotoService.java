package com.elecciones.services;

import com.elecciones.entities.Candidato;
import com.elecciones.entities.Voto;
import com.elecciones.repositories.VotoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VotoService {
    private final VotoRepository votoRepository;

    VotoService(VotoRepository votoRepository){
        this.votoRepository = votoRepository;
    }

    public Voto create (Voto voto){
        return votoRepository.save(voto);
    }

    public Voto findOne (Integer id){
        return votoRepository.findById(id).get();
    }

    public List<Voto> findAll(){
        return  votoRepository.findAll();
    }

    public Voto update (Voto voto){
        return votoRepository.save(voto);
    }

    public void remove (Integer id){
        votoRepository.deleteById(id);
    }

    public Voto findByUuid (String uuid){
        return  votoRepository.findByUuid(uuid).get();
    }

}
