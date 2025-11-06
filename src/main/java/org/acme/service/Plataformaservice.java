package org.acme.service;

import java.util.List;

import org.acme.dto.PlataformaResponse;
import org.acme.dto.Plataformadto;
import org.acme.model.Plataforma;

import jakarta.validation.Valid;

public interface Plataformaservice {
        PlataformaResponse inserir(@Valid Plataformadto plataforma);
    void atualizar(Long id,Plataformadto plataforma);
    void deletar(Long id);
    PlataformaResponse procura_id(Long id);
    PlataformaResponse procura_nome(String nome);
    List<Plataforma> procura_todos(Integer page, Integer pageSize);
    Long count();
}
