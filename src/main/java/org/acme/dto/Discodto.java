package org.acme.dto;

import jakarta.validation.constraints.NotNull;

public class Discodto {

    @NotNull(message = "O nome deve ser informado (back).")
    private String desenvolvedoraDisco;
    
    @NotNull(message = "O nome deve ser informado (back).")
    private String modoJogo;

}
