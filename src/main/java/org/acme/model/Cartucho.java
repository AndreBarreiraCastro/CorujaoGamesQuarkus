package org.acme.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cartucho extends Midia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length = 60, nullable = false)
    private String desenvolvedoraCartucho;

    @Column(length = 60, nullable = false)
    private String modoJogo;

    public String getDesenvolvedoraCartucho() {
        return desenvolvedoraCartucho;
    }

    public void setDesenvolvedoraCartucho(String desenvolvedoraCartucho) {
        this.desenvolvedoraCartucho = desenvolvedoraCartucho;
    }

    public String getModoJogo() {
        return modoJogo;
    }

    public void setModoJogo(String modoJogo) {
        this.modoJogo = modoJogo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
