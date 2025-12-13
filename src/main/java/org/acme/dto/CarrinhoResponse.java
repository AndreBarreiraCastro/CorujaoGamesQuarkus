package org.acme.dto;

import java.util.List;

import org.acme.model.Carrinho;
import org.acme.model.ItemCarrinho;

import io.quarkus.hibernate.orm.panache.PanacheQuery;

public record CarrinhoResponse(
    Long id,
    Long usuarioId,
    List<ItemCarrinho> itens
) {
    public static CarrinhoResponse valueOf(Carrinho c) {
        return new CarrinhoResponse(c.getId(), c.getUsuario().getId(), c.getItens());
    }

    public static java.util.List<CarrinhoResponse> valueOf1(PanacheQuery<Carrinho> query) {
        return query.stream().map(CarrinhoResponse::valueOf).toList();
    }
}