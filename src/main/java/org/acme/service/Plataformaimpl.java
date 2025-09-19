package org.acme.service;

import java.util.List;

import org.acme.dto.ColecaoResponse;
import org.acme.dto.PlataformaResponse;
import org.acme.dto.Plataformadto;
import org.acme.model.Colecao;
import org.acme.model.Plataforma;
import org.acme.repository.Plataformarepository;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
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

    @Override
    public List<PlataformaResponse> procura_todos(Integer page, Integer pageSize) {
          PanacheQuery<Plataforma> query = null;
        if (page == null || pageSize == null)
            query = repository.findAll();
        else
            query = repository.findAll().page(page, pageSize);

        return PlataformaResponse.valueOf1( query);
    }
    }
    

