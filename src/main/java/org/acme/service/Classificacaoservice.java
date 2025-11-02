package org.acme.service;

import java.util.List;

import org.acme.dto.ClassificacaoResponse;
import org.acme.dto.Classificacaodto;
import org.acme.model.Classificacao;

public interface Classificacaoservice {
  ClassificacaoResponse inserir(Classificacaodto classificacao);

  void atualizar(Long id, Classificacaodto classificacao);

  void deletar(Long id);

  ClassificacaoResponse procura_id(Long id);

  /*
   * ClassificacaoResponse procura_nome(String nome);
   */ List<Classificacao> procura_todos(Integer page, Integer pageSize);

  Long count();

}
