package org.acme.service;

import org.acme.dto.ClassificacaoResponse;
import org.acme.dto.Classificacaodto;
import org.acme.model.Classificacao;
import org.acme.repository.Classificacaorepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class Classificacaoimpl implements Classificacaoservice {

    @Inject
    Classificacaorepository repository;

    @Override
    public ClassificacaoResponse inserir( Classificacaodto classificacao) {
        Classificacao novo = new Classificacao();
        novo.setIdademinima(classificacao.getidademinima());
        novo.setDescricao(classificacao.getdescricao());
        repository.persist(novo);
        return ClassificacaoResponse.valueOf(novo);
    }

    @Override
    public void atualizar(Long id, Classificacaodto classificacao) {
        Classificacao atualizado = repository.findById(id);
        atualizado.setIdademinima(classificacao.getidademinima());
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
    /*
     * @Override
     * public ClassificacaoResponse procura_nome(String nome) {
     * Classificacao achado = repository.acharPorNome(nome);
     * return ClassificacaoResponse.valueOf(achado);
     * }
     * 
     * @Override
     * public List<ClassificacaoResponse> procura_todos(Integer page, Integer pageSize) {
     * PanacheQuery<Classificacao> query = null;
     * if (page == null || pageSize == null)
     * query = repository.findAll();
     * else
     * query = repository.findAll().page(page, pageSize);
     * 
     * return ClassificacaoResponse.valueOf1( query);
     * }
     * 
     */
}
