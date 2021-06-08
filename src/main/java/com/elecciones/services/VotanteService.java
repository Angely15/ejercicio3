package com.elecciones.services;

import com.elecciones.entities.Candidato;
import com.elecciones.entities.Votante;
import com.elecciones.repositories.VotanteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VotanteService {
    private final VotanteRepository votanteRepository;

    VotanteService(VotanteRepository votanteRepository){
        this.votanteRepository = votanteRepository;
    }

    public Votante create (Votante votante){
        return votanteRepository.save(votante);
    }

    public Votante findOne (Integer id){
        return votanteRepository.findById(id).get();
    }

    public List<Votante> findAll(){
        return  votanteRepository.findAll();
    }

    public Votante update (Votante votante){
        return votanteRepository.save(votante);
    }

    public void remove (Integer id){
        votanteRepository.deleteById(id);
    }
}
