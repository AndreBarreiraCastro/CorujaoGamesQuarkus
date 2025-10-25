package org.acme.service;

import java.util.List;

import org.acme.dto.JogoResponse;
import org.acme.dto.Jogodto;
import org.acme.dto.SagaResponse;
import org.acme.model.Jogo;
import org.acme.model.Saga;
import org.acme.repository.Jogorepository;
import org.acme.repository.Sagarepository;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class Jogoimpl implements Jogoservice {
    
    @Inject
    Jogorepository repository;

    /* @Override
    public JogoResponse inserir(Jogodto jogo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inserir'");
    }

    @Override
    public void atualizar(Long id, Jogodto jogo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }

    @Override
    public void deletar(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletar'");
    }

    @Override
    public JogoResponse procura_id(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'procura_id'");
    }

    @Override
    public JogoResponse procura_nome(String nome) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'procura_nome'");
    }
 */
    @Override
    public List<JogoResponse> procura_todos(Integer page, Integer pageSize) {
             PanacheQuery<Jogo> query = null;
        if (page == null || pageSize == null)
            query = repository.findAll();
        else
            query = repository.findAll().page(page, pageSize);
        
        return JogoResponse.valueOf1( query);
    }}
    

