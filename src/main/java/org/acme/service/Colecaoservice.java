package org.acme.service;

import java.util.List;

import org.acme.dto.ColecaoResponse;
import org.acme.dto.Colecaodto;
import org.acme.model.Colecao;

import jakarta.validation.Valid;

public interface Colecaoservice {
    ColecaoResponse inserir(@Valid Colecaodto colecao);
    void atualizar(Long id,Colecaodto colecao);
    void deletar(Long id);
    ColecaoResponse procura_id(Long id);
    ColecaoResponse procura_nome(String nome);
    List<Colecao> procura_todos(Integer page, Integer pageSize);
    Long count();
}
