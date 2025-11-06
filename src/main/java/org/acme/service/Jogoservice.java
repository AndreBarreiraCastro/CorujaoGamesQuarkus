package org.acme.service;

import java.util.List;

import org.acme.dto.JogoResponse;
import org.acme.dto.Jogodto;

import jakarta.validation.Valid;

public interface Jogoservice {
    JogoResponse inserir(@Valid Jogodto jogo);

    void atualizar(Long id, Jogodto jogo);

    void deletar(Long id);

    JogoResponse procura_id(Long id);

    /*
     * JogoResponse procura_nome(String nome);
     */
    List<JogoResponse> procura_todos(Integer page, Integer pageSize);

    Long count();

}
