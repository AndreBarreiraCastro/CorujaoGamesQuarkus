package org.acme.dto;

import jakarta.validation.constraints.NotNull;

public class Carrinhodto {

    @NotNull(message = "Usuario deve ser informado")
    private Long usuarioId;

    public Long getUsuarioId() {
        return usuarioId;
    }
}