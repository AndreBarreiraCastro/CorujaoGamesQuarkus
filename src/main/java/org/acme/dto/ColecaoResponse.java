package org.acme.dto;

import org.acme.model.Colecao;

public record ColecaoResponse(
    Long id,
    String nome
) {

    public static ColecaoResponse valueOf(Colecao colecao) {
        return new ColecaoResponse(
            colecao.getId(),
            colecao.getNomeColecao());
    }
    
}
