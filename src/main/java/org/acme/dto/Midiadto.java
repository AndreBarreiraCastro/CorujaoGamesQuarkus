package org.acme.dto;

import jakarta.validation.constraints.NotNull;

// DTO genérico
public class Midiadto {

    @NotNull(message = "A desenvolvedora deve ser informada.")
    private String desenvolvedora;

    @NotNull(message = "O modo de jogo deve ser informado.")
    private String modoJogo;

    public String getDesenvolvedora() { return desenvolvedora; }
    public void setDesenvolvedora(String desenvolvedora) { this.desenvolvedora = desenvolvedora; }

    public String getModoJogo() { return modoJogo; }
    public void setModoJogo(String modoJogo) { this.modoJogo = modoJogo; }
}

