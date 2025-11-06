package org.acme.service;

import java.util.List;

import org.acme.dto.CartuchoResponse;
import org.acme.dto.Cartuchodto;
import org.acme.model.Cartucho;
import org.acme.repository.Cartuchorepository;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class Cartuchoimpl implements Cartuchoservice {

    @Inject
    Cartuchorepository repository;

    @Override
    public CartuchoResponse inserir(Cartuchodto cartucho) {

        validarDados(cartucho, null);
        Cartucho novo = new Cartucho();
        novo.setDesenvolvedora(cartucho.getDesenvolvedora());
        novo.setModoJogo(cartucho.getModoJogo());
        repository.persist(novo);
        return CartuchoResponse.valueOf(novo);
    }

    @Override
    public void atualizar(Long id, Cartuchodto cartucho) {
        Cartucho atualizado = repository.findById(id);
        atualizado.setDesenvolvedora(cartucho.getDesenvolvedora());
        atualizado.setModoJogo(cartucho.getModoJogo());
        repository.persist(atualizado);
        repository.persist(atualizado);
    }

    @Override
    public void deletar(Long id) {
        repository.deleteById(id);
    }

    @Override
    public CartuchoResponse procura_id(Long id) {
        Cartucho achado = repository.findById(id);
        return CartuchoResponse.valueOf(achado);
    }

    @Override
    public List<Cartucho> procura_todos(Integer page, Integer pageSize) {

        PanacheQuery<Cartucho> query = null;
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
    private void validarDados(Cartuchodto dto, Long id) {
        
    }
}
