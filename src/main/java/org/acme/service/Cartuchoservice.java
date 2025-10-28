package org.acme.service;

import java.util.List;

import org.acme.dto.CartuchoResponse;
import org.acme.dto.Cartuchodto;

public interface Cartuchoservice {
    CartuchoResponse inserir(Cartuchodto cartucho);

    void atualizar(Long id, Cartuchodto cartucho);

    void deletar(Long id);

    CartuchoResponse procura_id(Long id);

    List<CartuchoResponse> procura_todos(Integer page, Integer pageSize);

}
