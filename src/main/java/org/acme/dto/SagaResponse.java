package org.acme.dto;

import org.acme.model.Colecao;
import org.acme.model.Saga;

public record SagaResponse(
    Long id,
    String nome
) {

    public static SagaResponse valueOf(Saga saga) {
        return new SagaResponse(
            saga.getId(),
            saga.getNomeSaga());
    }
    
}
