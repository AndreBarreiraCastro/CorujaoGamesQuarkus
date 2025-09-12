package org.acme.service;

import org.acme.dto.ColecaoResponse;
import org.acme.dto.Colecaodto;

public interface Colecaoservice {
    ColecaoResponse inserir(Colecaodto colecao);
    void atualizar(Long id,Colecaodto colecao);
    void deletar(Long id);
    ColecaoResponse procura_id(Long id);
    ColecaoResponse procura_nome(String nome);
}
