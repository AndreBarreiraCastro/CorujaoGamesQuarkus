package org.acme.dto;

import jakarta.validation.constraints.NotNull;

public class Meiodto {

    @NotNull(message = "O nome do meio de pagamento deve ser informado.")
    private String nome;

    @NotNull(message = "O usuário deve ser informado.")
    private Long usuarioId;

    public String getNome() {
        return nome;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }
}