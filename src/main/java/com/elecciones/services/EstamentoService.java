package com.elecciones.services;

import com.elecciones.entities.Candidato;
import com.elecciones.entities.Estamento;
import com.elecciones.repositories.EstamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstamentoService {
    private final EstamentoRepository estamentoRepository;

    EstamentoService(EstamentoRepository estamentoRepository){
        this.estamentoRepository = estamentoRepository;
    }

    public Estamento create (Estamento estamento){
        return estamentoRepository.save(estamento);
    }

    public Estamento findOne (Integer id){
        return estamentoRepository.findById(id).get();
    }

    public List<Estamento> findAll(){
        return  estamentoRepository.findAll();
    }

    public Estamento update (Estamento estamento){
        return estamentoRepository.save(estamento);
    }

    public void remove (Integer id){
        estamentoRepository.deleteById(id);
    }
}
