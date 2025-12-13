package org.acme.service;

import java.util.List;

import org.acme.dto.MeioResponse;
import org.acme.dto.Meiodto;
import org.acme.model.MeioPagamento;
import org.acme.model.Usuario;
import org.acme.repository.Meiorepository;
import org.acme.repository.Usuariorepository;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;

@ApplicationScoped
public class MeioImpl implements Meioservice {

    @Inject
    Meiorepository repository;

    @Inject
    Usuariorepository usuariorepository;

    @Override
    public MeioResponse inserir(Meiodto meio) {
        validarDados(meio, null);
        MeioPagamento novo = new MeioPagamento();
        novo.setNome(meio.getNome());
        Usuario u = usuariorepository.findById(meio.getUsuarioId());
        if (u == null) throw new NotFoundException("Usuario nao encontrado");
        novo.setUsuario(u);
        repository.persist(novo);
        return MeioResponse.valueOf(novo);
    }

    @Override
    @Transactional
    public void atualizar(Long id, Meiodto meio) {
        MeioPagamento existente = repository.findById(id);
        if (existente == null) throw new NotFoundException("MeioPagamento com ID " + id + " não encontrado.");
        existente.setNome(meio.getNome());
        Usuario u = usuariorepository.findById(meio.getUsuarioId());
        if (u == null) throw new NotFoundException("Usuario nao encontrado");
        existente.setUsuario(u);
        repository.persist(existente);
    }

    @Override
    public void deletar(Long id) {
        repository.deleteById(id);
    }

    @Override
    public MeioResponse procura_id(Long id) {
        MeioPagamento achado = repository.findById(id);
        return MeioResponse.valueOf(achado);
    }

    @Override
    public MeioResponse procura_nome(String nome) {
        MeioPagamento achado = repository.acharPorNome(nome);
        return MeioResponse.valueOf(achado);
    }

    @Override
    @Transactional
    public List<MeioPagamento> procura_todos(Integer page, Integer pageSize) {
        PanacheQuery<MeioPagamento> query = null;
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

    private void validarDados(Meiodto dto, Long id) {
        // adicionar validações específicas se necessário
    }
}