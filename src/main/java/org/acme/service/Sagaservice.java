package org.acme.service;

import org.acme.dto.SagaResponse;
import org.acme.dto.Sagadto;

public interface Sagaservice {
        SagaResponse inserir(Sagadto saga);
    void atualizar(Long id,Sagadto saga);
    void deletar(Long id);
    SagaResponse procura_id(Long id);
    SagaResponse procura_nome(String nome);

}
