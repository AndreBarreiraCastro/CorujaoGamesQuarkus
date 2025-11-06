package org.acme.service;

import java.util.List;

import org.acme.dto.JogoResponse;
import org.acme.dto.Jogodto;
import org.acme.model.Jogo;
import org.acme.model.Plataforma;
import org.acme.repository.Classificacaorepository;
import org.acme.repository.Estoquerepository;
import org.acme.repository.Jogorepository;
import org.acme.repository.Midiarepository;
import org.acme.repository.Plataformarepository;
import org.acme.repository.Sagarepository;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;

@ApplicationScoped
public class Jogoimpl implements Jogoservice {

    @Inject
    Jogorepository repository;

    @Inject
    Sagarepository sagarepository;

    @Inject
    Estoquerepository estoquerepository;

    @Inject
    Classificacaorepository classificacaorepository;

    @Inject
    Plataformarepository plataformarepository;

    @Inject
    Midiarepository midiarepository;

    @Override
    public JogoResponse inserir(Jogodto jogo) {

        validarDados(jogo,null);
        Jogo novo = new Jogo();
        novo.setGenero(jogo.getGenero());
        novo.setJogoClassificacao(classificacaorepository.findById(jogo.getJogoClassificacao()));
        novo.setJogoEstoque(estoquerepository.findById(jogo.getJogoEstoque()));
        novo.setJogoMidia(midiarepository.findById(jogo.getJogoMidia()));
        novo.setTitulo(jogo.getTitulo());
        novo.setJogoSaga(sagarepository.findById(jogo.getJogoSaga()));
        novo.setPrecoUnit(jogo.getprecoUnit());

        List<Plataforma> plataformas = jogo.getJogoPlataforma().stream()
                .map(id -> plataformarepository.findById(id))
                .toList();

        novo.setJogoPlataforma(plataformas);
        repository.persist(novo);
        return JogoResponse.valueOf(novo);
    }

    @Override
    @Transactional
    public void atualizar(Long id, Jogodto jogo) {
        Jogo existente = repository.findById(id);

        if (existente == null) {
            throw new NotFoundException("Jogo com ID " + id + " não encontrado.");
        }

        // Atualiza somente os campos que podem ser alterados
        existente.setGenero(jogo.getGenero());
        existente.setJogoClassificacao(classificacaorepository.findById(jogo.getJogoClassificacao()));
        existente.setJogoEstoque(estoquerepository.findById(jogo.getJogoEstoque()));
        existente.setJogoMidia(midiarepository.findById(jogo.getJogoMidia()));
        existente.setTitulo(jogo.getTitulo());
        existente.setJogoSaga(sagarepository.findById(jogo.getJogoSaga()));
        existente.setPrecoUnit(jogo.getprecoUnit());
        
        List<Plataforma> plataformas = jogo.getJogoPlataforma().stream()
        .map(ids -> plataformarepository.findById(ids))
        .toList();
        
        existente.setJogoPlataforma(plataformas);
        repository.persist(existente);
    }

    @Override
    public void deletar(Long id) {
        repository.delete(repository.findById(id));
    }

    @Override
    public JogoResponse procura_id(Long id) {
        return JogoResponse.valueOf(repository.findById(id));
    }

    /*
     * @Override
     * public JogoResponse procura_nome(String nome) {
     * // TODO Auto-generated method stub
     * throw new
     * UnsupportedOperationException("Unimplemented method 'procura_nome'");
     * }
     */

    @Override
    public List<JogoResponse> procura_todos(Integer page, Integer pageSize) {
        PanacheQuery<Jogo> query = null;
        if (page == null || pageSize == null)
            query = repository.findAll();
        else
            query = repository.findAll().page(page, pageSize);

        return JogoResponse.valueOf1(query);
    }

    
    @Override
    public Long count() {
    return repository.count();    
    }

    private void validarDados(Jogodto dto, Long id) {
        
    }

}
