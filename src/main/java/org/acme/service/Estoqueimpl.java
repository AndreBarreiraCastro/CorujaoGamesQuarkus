package org.acme.service;

import java.util.List;

import org.acme.dto.EstoqueResponse;
import org.acme.dto.Estoquedto;
import org.acme.model.Estoque;
import org.acme.repository.Estoquerepository;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class Estoqueimpl implements Estoqueservice {

    @Inject
    Estoquerepository repository;

    @Override
    public EstoqueResponse inserir(Estoquedto estoque) {
        Estoque novo = new Estoque();
        novo.setQuantidade(estoque.getEstoque());
        ;
        repository.persist(novo);
        return EstoqueResponse.valueOf(novo);
    }

    @Override
    public void atualizar(Long id, Estoquedto estoque) {
        Estoque atualizado = repository.findById(id);
        atualizado.setQuantidade(estoque.getEstoque());
        repository.persist(atualizado);
    }

    @Override
    public void deletar(Long id) {
        repository.deleteById(id);
    }

    @Override
    public EstoqueResponse procura_id(Long id) {
        Estoque achado = repository.findById(id);
        return EstoqueResponse.valueOf(achado);
    }
    /*
     * @Override
     * public EstoqueResponse procura_nome(String nome) {
     * Estoque achado = repository.acharPorNome(nome);
     * return EstoqueResponse.valueOf(achado);
     * }
     * 
     * @Override
     * public List<EstoqueResponse> procura_todos(Integer page, Integer pageSize) {
     * PanacheQuery<Estoque> query = null;
     * if (page == null || pageSize == null)
     * query = repository.findAll();
     * else
     * query = repository.findAll().page(page, pageSize);
     * 
     * return EstoqueResponse.valueOf1( query);
     * }
     * 
     */
}
