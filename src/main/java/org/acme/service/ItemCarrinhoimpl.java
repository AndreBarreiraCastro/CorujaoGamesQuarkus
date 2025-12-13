package org.acme.service;

import java.util.List;

import org.acme.dto.ItemCarrinhoResponse;
import org.acme.dto.ItemCarrinhodto;
import org.acme.model.Carrinho;
import org.acme.model.ItemCarrinho;
import org.acme.model.Jogo;
import org.acme.repository.Carrinhorepository;
import org.acme.repository.ItemCarrinhorepository;
import org.acme.repository.Jogorepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;

@ApplicationScoped
public class ItemCarrinhoimpl implements ItemCarrinhoservice {

    @Inject
    ItemCarrinhorepository repository;

    @Inject
    Carrinhorepository carrinhoRepository;

    @Inject
    Jogorepository jogoRepository;

    @Override
    @Transactional
    public ItemCarrinhoResponse inserir(ItemCarrinhodto dto) {
        Carrinho c = carrinhoRepository.findById(dto.getCarrinhoId());
        if (c == null) throw new NotFoundException("Carrinho nao encontrado");
        Jogo j = jogoRepository.findById(dto.getJogoId());
        if (j == null) throw new NotFoundException("Jogo nao encontrado");

        ItemCarrinho existente = repository.acharPorCarrinhoEJogo(c.getId(), j.getId());
        if (existente != null) {
            existente.setQuantidade(existente.getQuantidade() + dto.getQuantidade());
            repository.persist(existente);
            return ItemCarrinhoResponse.valueOf(existente);
        }

        ItemCarrinho novo = new ItemCarrinho();
        novo.setCarrinho(c);
        novo.setJogo(j);
        novo.setQuantidade(dto.getQuantidade());
        novo.setPrecoUnit(j.getPrecoUnit());
        repository.persist(novo);
        return ItemCarrinhoResponse.valueOf(novo);
    }

    @Override
    @Transactional
    public void atualizar(Long id, ItemCarrinhodto dto) {
        ItemCarrinho atual = repository.findById(id);
        if (atual == null) throw new NotFoundException("Item nao encontrado");
        atual.setQuantidade(dto.getQuantidade());
        repository.persist(atual);
    }

    @Override
    public void deletar(Long id) {
        repository.deleteById(id);
    }

    @Override
    public ItemCarrinhoResponse procura_id(Long id) {
        ItemCarrinho i = repository.findById(id);
        if (i == null) throw new NotFoundException("Item nao encontrado");
        return ItemCarrinhoResponse.valueOf(i);
    }

    @Override
    public List<ItemCarrinho> procura_todos_do_carrinho(Long carrinhoId) {
        return repository.find("carrinho.id = ?1", carrinhoId).list();
    }

    @Override
    public Long count() {
        return repository.count();
    }
}