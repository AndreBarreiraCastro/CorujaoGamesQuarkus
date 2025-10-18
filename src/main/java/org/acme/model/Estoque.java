package org.acme.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Estoque extends DefaultEntity {
    
    @Column(nullable = false)
  private  int quantidade;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

      
    
}
