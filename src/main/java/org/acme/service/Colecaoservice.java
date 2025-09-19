package org.acme.service;

import java.util.List;

import org.acme.dto.ColecaoResponse;
import org.acme.dto.Colecaodto;

public interface Colecaoservice {
    ColecaoResponse inserir(Colecaodto colecao);
    void atualizar(Long id,Colecaodto colecao);
    void deletar(Long id);
    ColecaoResponse procura_id(Long id);
    ColecaoResponse procura_nome(String nome);
    List<ColecaoResponse> procura_todos(Integer page, Integer pageSize);
}
