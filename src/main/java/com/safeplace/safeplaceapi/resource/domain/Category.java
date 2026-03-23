package com.safeplace.safeplaceapi.resource.domain;

public enum Category {

    HEALTH("Salud"),
    LEGAL_SUPPORT("Soporte Legal"),
    SHELTER("Refugio"),
    PSYCHOLOGICAL_SUPPORT("Acompañamiento Psicológico"),
    LGBT_SUPPORT("Soporte a la Comunidad LGBTQ+"),
    SEXUAL_HEALTH("Salud Sexual (ESI)"),
    ECONOMIC_ASSISTANCE("Asistencia Económica"),
    EMERGENCY("Emergencia");

    private String label;

    Category(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}