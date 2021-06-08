package com.elecciones.controllers;

import com.elecciones.entities.Candidato;
import com.elecciones.entities.Eleccion;
import com.elecciones.entities.Estamento;
import com.elecciones.entities.Tipodocumento;
import com.elecciones.services.CandidatoService;
import com.elecciones.services.EleccionService;
import com.elecciones.services.EstamentoService;
import com.elecciones.services.TipodocumentoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*


import java.util.List;

@Controller
@RequestMapping("/candidato")
public class CandidatoController {

    private final CandidatoService candidatoService;
    private final EstamentoService estamentoService;
    private final TipodocumentoService tipodocumentoService;
    private final EleccionService eleccionService;

    CandidatoController(CandidatoService candidatoService,EstamentoService estamentoService, TipodocumentoService tipodocumentoService,EleccionService eleccionService) {
        this.candidatoService = candidatoService;
        this.estamentoService = estamentoService;
        this.tipodocumentoService =tipodocumentoService;
        this.eleccionService = eleccionService;
    }

    @GetMapping("/")
    public String elecion(Model modelo){
        List<Estamento> estamentos = estamentoService.findAll();
        List<Tipodocumento> tdocumentos = tipodocumentoService.findAll();
        List<Eleccion> procesos = eleccionService.findAll();

        modelo.addAttribute("estamentos",estamentos);
        modelo.addAttribute("tdocumentos",tdocumentos);
        modelo.addAttribute("procesos",procesos);
        return "_a";
    }


    @GetMapping("/new")
    public String muestra(Model modelo){
        List<Candidato> candidatos=candidatoService.findAll();
        modelo.addAttribute("candidatos",candidatos);
        return "cambio";
    }

    @PostMapping("/")
    public String confirmar(@RequestParam("nombre") String nombre,
                            @RequestParam("email") String email,
                            @RequestParam("estamento") String estamento,
                            @RequestParam("proceso") String proceso,
                            Model modelo){
        List<Tipodocumento> tdocumentos = tipodocumentoService.findAll();
        modelo.addAttribute("nombre",nombre);
        modelo.addAttribute("email",email);
        modelo.addAttribute("tdocumentos",tdocumentos);
        modelo.addAttribute("estamento",estamentoService.findOne(Integer.parseInt(estamento)));
        modelo.addAttribute("proceso",eleccionService.findOne(Integer.parseInt(proceso)));
        return "elecion";
    }

}
