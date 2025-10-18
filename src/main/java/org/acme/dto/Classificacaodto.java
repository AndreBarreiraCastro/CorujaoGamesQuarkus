package org.acme.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;

public class Classificacaodto {

  //@NotNull(message = "A idade nao pode ser nulo")
  @Max(value=18)
  private Integer idademinima;

  @NotNull()
  private String descricao;

  public Integer getidademinima() {
    return idademinima;
  }

  public String getdescricao() {
    return descricao;
  }

}
