package org.acme.service;

import org.acme.dto.SagaResponse;
import org.acme.dto.Sagadto;
import org.acme.model.Saga;
import org.acme.repository.Sagarepository;

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
    
}
