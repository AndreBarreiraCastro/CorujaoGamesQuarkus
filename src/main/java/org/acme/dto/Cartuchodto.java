package org.acme.dto;

import jakarta.validation.constraints.NotNull;

public class Cartuchodto {

    @NotNull(message = "O nome deve ser informado (back).")
    private String desenvolvedoraCartucho;

    @NotNull(message = "O nome deve ser informado (back).")
    private String modoJogo;

    public String getDesenvolvedoraCartucho() {
        return desenvolvedoraCartucho;
    }

    public String getModoJogo() {
        return modoJogo;
    }

}
