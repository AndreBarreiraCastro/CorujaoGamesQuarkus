package org.acme.dto;

import java.util.List;

import org.acme.model.Estoque;

import io.quarkus.hibernate.orm.panache.PanacheQuery;

public record EstoqueResponse(
    Long id,
    int quantidade
) {

    public static EstoqueResponse valueOf(Estoque estoque) {
        return new EstoqueResponse(
            estoque.getId(),
            estoque.getQuantidade());
    }
          public static List<EstoqueResponse> valueOf1(PanacheQuery<Estoque> estoque) {
        return estoque.stream()
        .map(e -> new EstoqueResponse(
            e.getId(),
            e.getQuantidade()))
        .toList();
    }  
    
}
