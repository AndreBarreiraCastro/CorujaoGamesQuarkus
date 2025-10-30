package org.acme.dto;

import java.util.List;

import org.acme.model.Disco;

import io.quarkus.hibernate.orm.panache.PanacheQuery;

public record DiscoResponse(
    Long id,
    String desenvolvedora,
    String modoJogo
) {

    public static DiscoResponse valueOf(Disco disco) {
        return new DiscoResponse(
            disco.getId(),
            disco.getDesenvolvedora(),
            disco.getModoJogo());
    }

       public static List<DiscoResponse> valueOf1(PanacheQuery<Disco> disco) {
        return disco.stream()
        .map(e -> new DiscoResponse(
            e.getId(),
            e.getDesenvolvedora(),
            e.getModoJogo()))
        .toList();
    }  
}
