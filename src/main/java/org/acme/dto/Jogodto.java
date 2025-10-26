package org.acme.dto;

import org.acme.model.Classificacao;
import org.acme.model.Estoque;
import org.acme.model.Saga;

import jakarta.validation.constraints.NotNull;

public class Jogodto {

  @NotNull(message = "O titulo deve ser informado.")
  private String titulo;
  
  @NotNull(message = "O genero deve ser informado.")
  private String genero;
  
  @NotNull(message = "O valor deve ser informado.")
  private Double valorUnit;
  
  @NotNull(message = "A  Saga deve ser informado.")
  private Saga jogoSaga;
  
  @NotNull(message = "A  Classifição não foi escolhida.")
  private Classificacao jogoClassificacao;
  
  @NotNull(message = "O Estoque não foi escolhido.")
  private Estoque jogoEstoque;

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public Double getValorUnit() {
        return valorUnit;
    }

    public Saga getJogoSaga() {
        return jogoSaga;
    }

    public Classificacao getJogoClassificacao() {
        return jogoClassificacao;
    }

    public Estoque getJogoEstoque() {
        return jogoEstoque;
    }
  

  
}
