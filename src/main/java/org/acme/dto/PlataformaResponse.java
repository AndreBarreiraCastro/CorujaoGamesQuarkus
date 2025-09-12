package org.acme.dto;

import org.acme.model.Colecao;
import org.acme.model.Plataforma;
import org.acme.model.Saga;

public record PlataformaResponse(
    Long id,
    String nome
) {

    public static PlataformaResponse valueOf(Plataforma plataforma) {
        return new PlataformaResponse(
            plataforma.getId(),
            plataforma.getNomePlataforma());
    }
    
}
