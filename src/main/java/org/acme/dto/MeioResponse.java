package org.acme.dto;

import java.util.List;

import org.acme.model.MeioPagamento;
import org.acme.model.Usuario;

import io.quarkus.hibernate.orm.panache.PanacheQuery;

public record MeioResponse(
    Long id,
    String nome,
    Usuario usuario
) {

    public static MeioResponse valueOf(MeioPagamento m) {
        return new MeioResponse(
            m.getId(),
            m.getNome(),
            m.getUsuario());
    }

    public static List<MeioResponse> valueOf1(PanacheQuery<MeioPagamento> query) {
        return query.stream()
            .map(e -> new MeioResponse(
                e.getId(),
                e.getNome(),
                e.getUsuario()))
            .toList();
    }
}