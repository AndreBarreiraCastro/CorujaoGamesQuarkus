package org.acme.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Plataforma extends DefaultEntity {
    
    @Column(length = 60,nullable = false)
    private String nomePlataforma;

    public String getNomePlataforma() {
        return nomePlataforma;
    }

    public void setNomePlataforma(String nomePlataforma) {
        this.nomePlataforma = nomePlataforma;
    }

    
}
