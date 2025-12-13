package org.acme.dto;

import jakarta.validation.constraints.NotNull;

public class ItemCarrinhodto {

    @NotNull(message = "carrinhoId obrigatório")
    private Long carrinhoId;

    @NotNull(message = "jogoId obrigatório")
    private Long jogoId;

    @NotNull(message = "quantidade obrigatório")
    private Integer quantidade;

    public Long getCarrinhoId() { return carrinhoId; }
    public Long getJogoId() { return jogoId; }
    public Integer getQuantidade() { return quantidade; }
}