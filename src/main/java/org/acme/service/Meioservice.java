package org.acme.service;

import java.util.List;

import org.acme.dto.MeioResponse;
import org.acme.dto.Meiodto;
import org.acme.model.MeioPagamento;

import jakarta.validation.Valid;

public interface Meioservice {
    MeioResponse inserir(@Valid Meiodto meio);
    void atualizar(Long id, Meiodto meio);
    void deletar(Long id);
    MeioResponse procura_id(Long id);
    MeioResponse procura_nome(String nome);
    List<MeioPagamento> procura_todos(Integer page, Integer pageSize);
    Long count();
}