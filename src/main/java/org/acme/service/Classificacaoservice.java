package org.acme.service;

import org.acme.dto.ClassificacaoResponse;
import org.acme.dto.Classificacaodto;

public interface Classificacaoservice {
    ClassificacaoResponse inserir( Classificacaodto classificacao);

    void atualizar(Long id, Classificacaodto classificacao);

    void deletar(Long id);

    ClassificacaoResponse procura_id(Long id);
    /*
     * ClassificacaoResponse procura_nome(String nome);
     * List<ClassificacaoResponse> procura_todos(Integer page, Integer pageSize);
     */
}
