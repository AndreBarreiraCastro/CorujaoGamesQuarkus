package org.acme.service;

import java.util.List;

import org.acme.dto.ColecaoResponse;
import org.acme.dto.Colecaodto;
import org.acme.model.Colecao;
import org.acme.repository.Colecaorepository;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
@ApplicationScoped
public class Colecaoimpl implements Colecaoservice {

    @Inject
    Colecaorepository repository;

    @Override
    public ColecaoResponse inserir(Colecaodto colecao) {

    validarDados(colecao, null);
    Colecao novo = new Colecao();
    novo.setNomeColecao(colecao.getNomeColecao());
    repository.persist(novo);
    return ColecaoResponse.valueOf(novo);
    }

    @Override
    public void atualizar(Long id,Colecaodto colecao) {
        Colecao atualizado = repository.findById(id);
        atualizado.setNomeColecao(colecao.getNomeColecao());
        repository.persist(atualizado);
    }

    @Override
    public void deletar(Long id) {
        repository.deleteById(id);
    }

    @Override
    public ColecaoResponse procura_id(Long id) {
       Colecao achado = repository.findById(id);
       return ColecaoResponse.valueOf(achado);
    }

    @Override
    public ColecaoResponse procura_nome(String nome) {
       Colecao achado = repository.acharPorNome(nome);
       return ColecaoResponse.valueOf(achado);
    }

    @Override
    public List<Colecao> procura_todos(Integer page, Integer pageSize) {
        
          PanacheQuery<Colecao> query = null;
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
        private void validarDados(Colecaodto dto, Long id) {
        
    }
}
