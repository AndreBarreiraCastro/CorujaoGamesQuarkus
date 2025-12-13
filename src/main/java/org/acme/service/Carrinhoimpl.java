package org.acme.service;

import java.util.List;

import org.acme.dto.CarrinhoResponse;
import org.acme.dto.Carrinhodto;
import org.acme.model.Carrinho;
import org.acme.model.Usuario;
import org.acme.repository.Carrinhorepository;
import org.acme.repository.Usuariorepository;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;

@ApplicationScoped
public class Carrinhoimpl implements Carrinhoservice {

    @Inject
    Carrinhorepository repository;

    @Inject
    Usuariorepository usuariorepository;

    @Override
    public CarrinhoResponse inserir(Carrinhodto dto) {
        Usuario u = usuariorepository.findById(dto.getUsuarioId());
        if (u == null) throw new NotFoundException("Usuario nao encontrado");
        Carrinho c = new Carrinho();
        c.setUsuario(u);
        repository.persist(c);
        return CarrinhoResponse.valueOf(c);
    }

    @Override
    @Transactional
    public void atualizar(Long id, Carrinhodto dto) {
        Carrinho existente = repository.findById(id);
        if (existente == null) throw new NotFoundException("Carrinho nao encontrado");
        Usuario u = usuariorepository.findById(dto.getUsuarioId());
        if (u == null) throw new NotFoundException("Usuario nao encontrado");
        existente.setUsuario(u);
        repository.persist(existente);
    }

    @Override
    public void deletar(Long id) {
        repository.deleteById(id);
    }

    @Override
    public CarrinhoResponse procura_id(Long id) {
        Carrinho c = repository.findById(id);
        if (c == null) throw new NotFoundException("Carrinho nao encontrado");
        return CarrinhoResponse.valueOf(c);
    }

    @Override
    public CarrinhoResponse procura_por_usuario(Long usuarioId) {
        Carrinho c = repository.acharPorUsuarioId(usuarioId);
        if (c == null) throw new NotFoundException("Carrinho nao encontrado para usuario");
        return CarrinhoResponse.valueOf(c);
    }

    @Override
    public List<Carrinho> procura_todos(Integer page, Integer pageSize) {
        PanacheQuery<Carrinho> query = null;
        if (page == null || pageSize == null)
            query = repository.findAll();
        else
            query = repository.findAll().page(page, pageSize);
        return query.list();
    }

    @Override
    public Long count() {
        return repository.count();
    }
}