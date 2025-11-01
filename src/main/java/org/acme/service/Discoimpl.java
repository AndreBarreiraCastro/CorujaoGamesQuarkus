package org.acme.service;

import java.util.List;

import org.acme.dto.DiscoResponse;
import org.acme.dto.Discodto;
import org.acme.model.Disco;
import org.acme.repository.Discorepository;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class Discoimpl implements Discoservice {

    @Inject
    Discorepository repository;

    @Override
    public DiscoResponse inserir(Discodto disco) {
        Disco novo = new Disco();
        novo.setDesenvolvedora(disco.getDesenvolvedora());
        novo.setModoJogo(disco.getModoJogo());
        repository.persist(novo);
        return DiscoResponse.valueOf(novo);
    }

    @Override
    public void atualizar(Long id, Discodto disco) {
        Disco atualizado = repository.findById(id);
        atualizado.setDesenvolvedora(disco.getDesenvolvedora());
        atualizado.setModoJogo(disco.getModoJogo());
        repository.persist(atualizado);
        repository.persist(atualizado);
    }

    @Override
    public void deletar(Long id) {
        repository.deleteById(id);
    }

    @Override
    public DiscoResponse procura_id(Long id) {
        Disco achado = repository.findById(id);
        return DiscoResponse.valueOf(achado);
    }

    @Override
    public List<Disco> procura_todos(Integer page, Integer pageSize) {

        PanacheQuery<Disco> query = null;
        if (page == null || pageSize == null)
            query = repository.findAll();
        else
            query = repository.findAll().page(page, pageSize);

        return query.list();
    }

    
    @Override
    public Long count() {
      return  repository.count();
    }

}
