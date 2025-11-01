package org.acme.dto;

import jakarta.validation.constraints.NotNull;

public class Cartuchodto {

    @NotNull(message = "O nome deve ser informado (back).")
    private String desenvolvedora;

    @NotNull(message = "O nome deve ser informado (back).")
    private String modoJogo;

  

    public String getModoJogo() {
        return modoJogo;
    }

    public String getDesenvolvedora() {
        return desenvolvedora;
    }

}
