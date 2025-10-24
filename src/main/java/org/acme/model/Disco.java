package org.acme.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Disco extends Midia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length = 60, nullable = false)
    private String desenvolvedoraDisco;

    @Column(length = 60, nullable = false)
    private String modoJogo;

    public String getDesenvolvedoraDisco() {
        return desenvolvedoraDisco;
    }

    public void setDesenvolvedoraDisco(String desenvolvedoraDisco) {
        this.desenvolvedoraDisco = desenvolvedoraDisco;
    }

    public String getModoJogo() {
        return modoJogo;
    }

    public void setModoJogo(String modoJogo) {
        this.modoJogo = modoJogo;
    }

}
