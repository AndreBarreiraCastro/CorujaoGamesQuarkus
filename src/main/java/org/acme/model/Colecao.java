package org.acme.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Colecao extends DefaultEntity {
    
    @Column(length = 60,nullable = false)
    private String nomeColecao;

    public String getNomeColecao() {
        return nomeColecao;
    }

    public void setNomeColecao(String nomeColecao) {
        this.nomeColecao = nomeColecao;
    }

    
}
