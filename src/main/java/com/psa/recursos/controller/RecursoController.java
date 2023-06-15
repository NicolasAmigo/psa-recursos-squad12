package com.psa.recursos.controller;

import com.psa.recursos.model.Recurso;
import com.psa.recursos.service.RecursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RecursoController {

    @Autowired
    RecursoService service;

    @GetMapping("/api/recursos")
    public List<Recurso> getRecursos() {

        List<Recurso> recursos = new ArrayList<Recurso>();

        try {
            recursos = service.getRecursos();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return recursos;
    }
}
