package org.acme.service;

import java.util.List;

import org.acme.dto.DiscoResponse;
import org.acme.dto.Discodto;
import org.acme.model.Disco;

public interface Discoservice {
    DiscoResponse inserir(Discodto disco);

    void atualizar(Long id, Discodto disco);

    void deletar(Long id);

    DiscoResponse procura_id(Long id);

    List<Disco> procura_todos(Integer page, Integer pageSize);

    Long count();

}
