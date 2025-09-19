package org.acme.service;

import java.util.List;

import org.acme.dto.PlataformaResponse;
import org.acme.dto.Plataformadto;

public interface Plataformaservice {
        PlataformaResponse inserir(Plataformadto plataforma);
    void atualizar(Long id,Plataformadto plataforma);
    void deletar(Long id);
    PlataformaResponse procura_id(Long id);
    PlataformaResponse procura_nome(String nome);
List<PlataformaResponse> procura_todos(Integer page, Integer pageSize);
}
