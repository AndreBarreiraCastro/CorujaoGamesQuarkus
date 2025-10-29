package org.acme.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;

public class Classificacaodto {

  //@NotNull(message = "A idade nao pode ser nulo")
  @Max(value=18)
  private Integer classificacao;

  @NotNull()
  private String descricao;

  
  public Integer getClassificacao() {
    return classificacao;
  }


  public String getdescricao() {
    return descricao;
  }

}
