package com.elecciones.services;

import com.elecciones.entities.Candidato;
import com.elecciones.repositories.CandidatoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatoService {
    private final CandidatoRepository candidatoRepository;

    CandidatoService(CandidatoRepository candidatoRepository){
        this.candidatoRepository = candidatoRepository;
    }

    public Candidato create (Candidato candidato){
        return candidatoRepository.save(candidato);
    }

    public Candidato findOne (Integer id){
        return candidatoRepository.findById(id).get();
    }

    public List<Candidato> findAll(){
        return  candidatoRepository.findAll();
    }

    public Candidato update (Candidato candidato){
        return candidatoRepository.save(candidato);
    }

    public void remove (Integer id){
        candidatoRepository.deleteById(id);
    }

}
