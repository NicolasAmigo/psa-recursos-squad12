package com.psa.recursos.service;

import com.psa.recursos.App;
import com.psa.recursos.model.Recurso;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class RecursoService {

    private final static Logger log = LoggerFactory.getLogger(App.class);

    @Autowired
    RestTemplate restTemplate;

    public List<Recurso> getRecursos() {
        ResponseEntity<Recurso[]> response = restTemplate.getForEntity(
                "https://anypoint.mulesoft.com/mocking/api/v1/sources/exchange/assets/754f50e8-20d8-4223-bbdc-56d50131d0ae/recursos-psa/1.0.1/m/api/recursos",
                Recurso[].class
        );
        List<Recurso> recursos = Arrays.asList(response.getBody());
        log.info(recursos.toString());
        return recursos;
    }
}
