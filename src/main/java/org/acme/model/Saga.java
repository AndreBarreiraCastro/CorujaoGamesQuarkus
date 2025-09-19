package org.acme.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Saga extends DefaultEntity {
    
    @Column(length = 60,nullable = false)
  private  String nomeSaga;

    public String getNomeSaga() {
        return nomeSaga;
    }

    public void setNomeSaga(String nomeSaga) {
        this.nomeSaga = nomeSaga;
    }

  
    
}
