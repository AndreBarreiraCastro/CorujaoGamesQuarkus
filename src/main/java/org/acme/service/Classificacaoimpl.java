package org.acme.service;

import java.util.List;

import org.acme.dto.ClassificacaoResponse;
import org.acme.dto.Classificacaodto;
import org.acme.model.Classificacao;
import org.acme.repository.Classificacaorepository;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class Classificacaoimpl implements Classificacaoservice {

    @Inject
    Classificacaorepository repository;

    @Override
    public ClassificacaoResponse inserir(Classificacaodto classificacao) {
        validarDados(classificacao, null);
        Classificacao novo = new Classificacao();
        novo.setClassificacao(classificacao.getClassificacao());
        novo.setDescricao(classificacao.getdescricao());
        repository.persist(novo);
        return ClassificacaoResponse.valueOf(novo);
    }

    @Override
    public void atualizar(Long id, Classificacaodto classificacao) {
        Classificacao atualizado = repository.findById(id);
        atualizado.setClassificacao(classificacao.getClassificacao());
        atualizado.setDescricao(classificacao.getdescricao());
        repository.persist(atualizado);
    }

    @Override
    public void deletar(Long id) {
        repository.deleteById(id);
    }

    @Override
    public ClassificacaoResponse procura_id(Long id) {
        Classificacao achado = repository.findById(id);
        return ClassificacaoResponse.valueOf(achado);
    }

    @Override
    public List<Classificacao> procura_todos(Integer page, Integer pageSize) {
        PanacheQuery<Classificacao> query = null;
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
    private void validarDados(Classificacaodto dto, Long id) {
        
    }
}
