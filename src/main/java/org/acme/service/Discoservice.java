package org.acme.service;

import java.util.List;

import org.acme.dto.DiscoResponse;
import org.acme.dto.Discodto;

public interface Discoservice {
    DiscoResponse inserir(Discodto disco);

    void atualizar(Long id, Discodto disco);

    void deletar(Long id);

    DiscoResponse procura_id(Long id);

    List<DiscoResponse> procura_todos(Integer page, Integer pageSize);

}
