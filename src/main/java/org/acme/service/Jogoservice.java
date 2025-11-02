package org.acme.service;

import java.util.List;

import org.acme.dto.JogoResponse;
import org.acme.dto.Jogodto;
import org.acme.model.Jogo;

public interface Jogoservice {
    JogoResponse inserir(Jogodto jogo);

    void atualizar(Long id, Jogodto jogo);

    void deletar(Long id);

    JogoResponse procura_id(Long id);

    /*
     * JogoResponse procura_nome(String nome);
     */
    List<Jogo> procura_todos(Integer page, Integer pageSize);

    Long count();

}
