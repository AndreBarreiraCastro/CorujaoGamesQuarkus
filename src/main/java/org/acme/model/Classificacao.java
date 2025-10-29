package org.acme.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Classificacao extends DefaultEntity {
    
    @Column(nullable = false,precision=2)
    private int classificacao;
    
    @Column(length = 60,nullable = false)
    private String descricao;

    

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

}
