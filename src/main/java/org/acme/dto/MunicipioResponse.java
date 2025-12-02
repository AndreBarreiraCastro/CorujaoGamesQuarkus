package org.acme.dto;

import java.util.List;

import org.acme.model.Municipio;

import io.quarkus.hibernate.orm.panache.PanacheQuery;

public record MunicipioResponse(
        Long id,
        String nome,
        String estado) {

    public static MunicipioResponse valueOf(Municipio municipio) {
        return new MunicipioResponse(
                municipio.getId(),
                municipio.getNome(),
               municipio.getEstadoMunicipio().getNome()
        );
    }

    public static List<MunicipioResponse> valueOf1(PanacheQuery<Municipio> jogo) {
        return jogo.stream()
                .map(e -> new MunicipioResponse(
                        e.getId(),
                        e.getNome(),
                        e.getEstadoMunicipio().getNome()))
                .toList();
    }

}
