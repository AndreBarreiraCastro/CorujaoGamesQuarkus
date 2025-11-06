package org.acme.service;

import java.util.List;

import org.acme.dto.EstoqueResponse;
import org.acme.dto.Estoquedto;
import org.acme.model.Estoque;

import jakarta.validation.Valid;

public interface Estoqueservice {
    EstoqueResponse inserir(@Valid Estoquedto estoque);

    void atualizar(Long id, Estoquedto estoque);

    void deletar(Long id);

    EstoqueResponse procura_id(Long id);

    List<Estoque> procura_todos(Integer page, Integer pageSize);

    Long count();

}
