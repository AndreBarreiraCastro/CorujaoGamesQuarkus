package org.acme.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Cartucho extends DefaultEntity {

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

}
