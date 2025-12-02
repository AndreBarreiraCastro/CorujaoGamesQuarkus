package org.acme.service;

import java.util.List;

import org.acme.dto.EnderecoResponse;
import org.acme.dto.Enderecodto;
import org.acme.model.Endereco;

import jakarta.validation.Valid;

public interface Enderecoservice {
   EnderecoResponse inserir(@Valid Enderecodto endereco);

    void atualizar(Long id,Enderecodto endereco);

    void deletar(Long id);

   EnderecoResponse procura_id(Long id);

    List<Endereco> procura_todos(Integer page, Integer pageSize);

    Long count();

}
