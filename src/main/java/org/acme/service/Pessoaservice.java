package org.acme.service;

import java.util.List;

import org.acme.dto.PessoaResponse;
import org.acme.dto.Pessoadto;
import org.acme.model.Pessoa;
import org.acme.model.Usuario;

import jakarta.validation.Valid;

public interface Pessoaservice {
   PessoaResponse inserir(@Valid Pessoadto pessoa);

    void atualizar(Long id,Pessoadto pessoa);

    void deletar(Long id);

   PessoaResponse procura_id(Long id);

    List<Pessoa> procura_todos(Integer page, Integer pageSize);

    Long count();
 public Usuario findByLoginAndSenha(String login, String senha);
}
