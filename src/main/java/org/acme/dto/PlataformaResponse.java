package org.acme.dto;

import java.util.List;

import org.acme.model.Plataforma;

import io.quarkus.hibernate.orm.panache.PanacheQuery;

public record PlataformaResponse(
    Long id,
    String nome
) {

    public static PlataformaResponse valueOf(Plataforma plataforma) {
        return new PlataformaResponse(
            plataforma.getId(),
            plataforma.getNomePlataforma());
    }
      public static List<PlataformaResponse> valueOf1(PanacheQuery<Plataforma> plataforma) {
        return plataforma.stream()
        .map(e -> new PlataformaResponse(
            e.getId(),
            e.getNomePlataforma()))
        .toList();
    }  
    
}
