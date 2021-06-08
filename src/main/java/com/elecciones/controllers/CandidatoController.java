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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


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





    //metodo recuerda en la web solo hay gets, para los parametros un ejemplo /candidato/id se escribe /{id} para conseguir esta id haces en el parametro del metodo debajo del decorador @PathVariable Integer id por ejemplo
    // puedes revisar aqui para eso https://github.com/StacklyCode/stacklyCode-team-backend/blob/dev/src/main/java/com/example/stacklyteam/web/resources/SkillResources.java
    // para pedir un objeto @RequestBody y el tipo por ejemplo aqui en el create yo haria un @RequestBody Candidato candidato

}
