package org.acme.repository;

import org.acme.model.ItemCarrinho;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ItemCarrinhorepository implements PanacheRepository<ItemCarrinho> {
    public ItemCarrinho acharPorCarrinhoEJogo(Long carrinhoId, Long jogoId){
        return find("SELECT i FROM ItemCarrinho i WHERE i.carrinho.id = ?1 AND i.jogo.id = ?2", carrinhoId, jogoId).firstResult();
    }
}