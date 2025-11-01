package org.acme.service;

import java.util.List;

import org.acme.dto.SagaResponse;
import org.acme.dto.Sagadto;
import org.acme.model.Saga;
import org.acme.repository.Sagarepository;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
@ApplicationScoped
public class Sagaimpl implements Sagaservice {

    @Inject
    Sagarepository repository;

    @Override
    public SagaResponse inserir(Sagadto saga) {
        Saga novo = new Saga();
        novo.setNomeSaga(saga.getNomeSaga());
        repository.persist(novo);
        return SagaResponse.valueOf(novo);
    }

    @Override
    public void atualizar(Long id, Sagadto saga) {
        Saga atualizado = repository.findById(id);
        atualizado.setNomeSaga(saga.getNomeSaga());
        repository.persist(atualizado);
    }

    @Override
    public void deletar(Long id) {
        repository.deleteById(id);
    }

    @Override
    public SagaResponse procura_id(Long id) {
        Saga achado = repository.findById(id);
        return SagaResponse.valueOf(achado);
    }

    @Override
    public SagaResponse procura_nome(String nome) {
        Saga achado = repository.acharPorNome(nome);
        return SagaResponse.valueOf(achado);
    }

    @Override
    public List<Saga> procura_todos(Integer page, Integer pageSize) {
          PanacheQuery<Saga> query = null;
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
    

