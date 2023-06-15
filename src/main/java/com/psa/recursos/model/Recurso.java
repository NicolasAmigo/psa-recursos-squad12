package com.psa.recursos.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Recurso {

    private Long legajo;

    @JsonProperty("Nombre")
    private String nombre;

    @JsonProperty("Apellido")
    private String apellido;

    public Recurso() {};

    public Recurso(Long legajo, String nombre, String apellido) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Long getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}
