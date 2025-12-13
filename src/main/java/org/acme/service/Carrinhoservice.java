package org.acme.service;

import java.util.List;

import org.acme.dto.CarrinhoResponse;
import org.acme.dto.Carrinhodto;
import org.acme.model.Carrinho;

import jakarta.validation.Valid;

public interface Carrinhoservice {
    CarrinhoResponse inserir(@Valid Carrinhodto dto);
    void atualizar(Long id, Carrinhodto dto);
    void deletar(Long id);
    CarrinhoResponse procura_id(Long id);
    CarrinhoResponse procura_por_usuario(Long usuarioId);
    List<Carrinho> procura_todos(Integer page, Integer pageSize);
    Long count();
}