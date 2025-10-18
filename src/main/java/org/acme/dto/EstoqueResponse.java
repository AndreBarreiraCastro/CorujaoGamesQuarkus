package org.acme.dto;

import org.acme.model.Estoque;

public record EstoqueResponse(
    Long id,
    int estoque
) {

    public static EstoqueResponse valueOf(Estoque estoque) {
        return new EstoqueResponse(
            estoque.getId(),
            estoque.getQuantidade());
    }
}
