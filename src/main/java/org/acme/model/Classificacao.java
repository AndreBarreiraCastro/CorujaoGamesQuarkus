package org.acme.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Classificacao extends DefaultEntity {
    
    @Column(nullable = false,precision=2)
    private int idademinima;
    
    @Column(length = 60,nullable = false)
    private String descricao;

    public int getIdademinima() {
        return idademinima;
    }

    public void setIdademinima(int idademinima) {
        this.idademinima = idademinima;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
