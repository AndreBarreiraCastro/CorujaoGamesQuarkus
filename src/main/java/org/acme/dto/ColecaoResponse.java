package org.acme.dto;

import java.util.List;

import org.acme.model.Colecao;

import io.quarkus.hibernate.orm.panache.PanacheQuery;

public record ColecaoResponse(
    Long id,
    String nome
) {

    public static ColecaoResponse valueOf(Colecao colecao) {
        return new ColecaoResponse(
            colecao.getId(),
            colecao.getNomeColecao());
    }
      public static List<ColecaoResponse> valueOf1(PanacheQuery<Colecao> colecao) {
        return colecao.stream()
        .map(e -> new ColecaoResponse(
            e.getId(),
            e.getNomeColecao()))
        .toList();
    }  
}
