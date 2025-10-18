package org.acme.service;

import org.acme.dto.EstoqueResponse;
import org.acme.dto.Estoquedto;

public interface Estoqueservice {
    EstoqueResponse inserir(Estoquedto estoque);

    void atualizar(Long id, Estoquedto estoque);

    void deletar(Long id);

    EstoqueResponse procura_id(Long id);
    /*
     * EstoqueResponse procura_nome(String nome);
     * List<EstoqueResponse> procura_todos(Integer page, Integer pageSize);
     */
}
