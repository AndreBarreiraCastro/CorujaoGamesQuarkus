package org.acme.dto;

import java.util.List;

import jakarta.validation.constraints.NotNull;

public class Jogodto {

  @NotNull(message = "O titulo deve ser informado.")
  private String titulo;
  
  @NotNull(message = "O genero deve ser informado.")
  private String genero;
  
  @NotNull(message = "O valor deve ser informado.")
  private Double valorUnit;
  
  @NotNull(message = "A  Saga deve ser informado.")
  private Long jogoSaga;
  
  @NotNull(message = "A  Classifição não foi escolhida.")
  private long  jogoClassificacao;
  
  @NotNull(message = "O Estoque não foi escolhido.")
  private long  jogoEstoque;
 
  @NotNull(message = "O Estoque não foi escolhido.")
  private Long jogoMidia;
 
  @NotNull(message = "O Estoque não foi escolhido.")
  private List<Long> jogoPlataforma;

  public String getTitulo() {
    return titulo;
  }

  public String getGenero() {
    return genero;
  }

  public Double getValorUnit() {
    return valorUnit;
  }

  public Long getJogoSaga() {
    return jogoSaga;
  }

  public long getJogoClassificacao() {
    return jogoClassificacao;
  }

  public long getJogoEstoque() {
    return jogoEstoque;
  }

  public Long getJogoMidia() {
    return jogoMidia;
  }

    public List<Long> getJogoPlataforma() {
        return jogoPlataforma;
    }

  
}
