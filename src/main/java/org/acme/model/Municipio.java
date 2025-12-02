package org.acme.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class Municipio extends DefaultEntity {

    @Column(length = 60, nullable = false)
    private String nome;

    @Enumerated(EnumType.STRING) // <--- SALVA COMO TEXTO
    @Column(nullable = false)
    private Estado estadoMunicipio;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstadoMunicipio() {
        return estadoMunicipio;
    }

    public void setEstadoMunicipio(Estado estadoMunicipio) {
        this.estadoMunicipio = estadoMunicipio;
    }

}
