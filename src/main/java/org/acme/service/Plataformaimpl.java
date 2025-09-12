package org.acme.service;

import org.acme.dto.PlataformaResponse;
import org.acme.dto.Plataformadto;
import org.acme.model.Plataforma;
import org.acme.repository.Plataformarepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
@ApplicationScoped
public class Plataformaimpl implements Plataformaservice {

    
    @Inject
    Plataformarepository repository;

    @Override
    public PlataformaResponse inserir(Plataformadto plataforma) {
        Plataforma novo = new Plataforma();
        novo.setNomePlataforma(plataforma.getNomePlataforma());
        repository.persist(novo);
        return PlataformaResponse.valueOf(novo);
    }

    @Override
    public void atualizar(Long id, Plataformadto plataforma) {
        Plataforma atualizado = repository.findById(id);
        atualizado.setNomePlataforma(plataforma.getNomePlataforma());
        repository.persist(atualizado);
    }

    @Override
    public void deletar(Long id) {
        repository.deleteById(id);
    }

    @Override
    public PlataformaResponse procura_id(Long id) {
        Plataforma achado = repository.findById(id);
        return PlataformaResponse.valueOf(achado);
    }
    
    @Override
    public PlataformaResponse procura_nome(String nome) {
        Plataforma achado = repository.acharPorNome(nome);
        return PlataformaResponse.valueOf(achado);
        }
    
}
