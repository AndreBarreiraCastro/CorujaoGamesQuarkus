package org.acme.dto;

import java.util.List;

import org.acme.model.ItemCarrinho;

import io.quarkus.hibernate.orm.panache.PanacheQuery;

public record ItemCarrinhoResponse(
    Long id,
    Long carrinhoId,
    Long jogoId,
    Integer quantidade,
    Double precoUnit
) {
    public static ItemCarrinhoResponse valueOf(ItemCarrinho i) {
        return new ItemCarrinhoResponse(i.getId(), i.getCarrinho().getId(), i.getJogo().getId(), i.getQuantidade(), i.getPrecoUnit());
    }

    public static List<ItemCarrinhoResponse> valueOf1(PanacheQuery<ItemCarrinho> q) {
        return q.stream().map(ItemCarrinhoResponse::valueOf).toList();
    }
}