package org.acme.service;

import java.util.List;

import org.acme.dto.ItemCarrinhoResponse;
import org.acme.dto.ItemCarrinhodto;
import org.acme.model.ItemCarrinho;

import jakarta.validation.Valid;

public interface ItemCarrinhoservice {
    ItemCarrinhoResponse inserir(@Valid ItemCarrinhodto dto);
    void atualizar(Long id, ItemCarrinhodto dto);
    void deletar(Long id);
    ItemCarrinhoResponse procura_id(Long id);
    List<ItemCarrinho> procura_todos_do_carrinho(Long carrinhoId);
    Long count();
}