package org.acme.dto;

import java.util.List;

import org.acme.model.Saga;

import io.quarkus.hibernate.orm.panache.PanacheQuery;

public record SagaResponse(
    Long id,
    String nome
) {

    public static SagaResponse valueOf(Saga saga) {
        return new SagaResponse(
            saga.getId(),
            saga.getNomeSaga());
    }
      public static List<SagaResponse> valueOf1(PanacheQuery<Saga> saga) {
        return saga.stream()
        .map(e -> new SagaResponse(
            e.getId(),
            e.getNomeSaga()))
        .toList();
    }  
    
}
