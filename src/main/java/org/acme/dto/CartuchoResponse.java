package org.acme.dto;

import java.util.List;

import org.acme.model.Cartucho;

import io.quarkus.hibernate.orm.panache.PanacheQuery;

public record CartuchoResponse(
    Long id,
    String desenvolvedoraCartucho,
    String modoJogo
) {

    public static CartuchoResponse valueOf(Cartucho cartucho) {
        return new CartuchoResponse(
            cartucho.getId(),
            cartucho.getDesenvolvedora(),
            cartucho.getModoJogo());
    }
    
       public static List<CartuchoResponse> valueOf1(PanacheQuery<Cartucho> cartucho) {
        return cartucho.stream()
        .map(e -> new CartuchoResponse(
            e.getId(),
            e.getDesenvolvedora(),
            e.getModoJogo()))
        .toList();
    } 
}
