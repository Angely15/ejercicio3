package com.elecciones.services;

import com.elecciones.entities.Candidato;
import com.elecciones.entities.Tipodocumento;
import com.elecciones.repositories.TipodocumentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipodocumentoService {
    private final TipodocumentoRepository tipodocumentoRepository;

    TipodocumentoService(TipodocumentoRepository tipodocumentoRepository){
        this.tipodocumentoRepository = tipodocumentoRepository;
    }

    public Tipodocumento create (Tipodocumento tipodocumento){
        return tipodocumentoRepository.save(tipodocumento);
    }

    public Tipodocumento findOne (Integer id){
        return tipodocumentoRepository.findById(id).get();
    }

    public List<Tipodocumento> findAll(){
        return  tipodocumentoRepository.findAll();
    }

    public Tipodocumento update (Tipodocumento tipodocumento){
        return tipodocumentoRepository.save(tipodocumento);
    }

    public void remove (Integer id){
        tipodocumentoRepository.deleteById(id);
    }
}
