package org.acme.dto;

import jakarta.validation.constraints.NotNull;

public class Sagadto {

  @NotNull(message = "O nome deve ser informado.")
  private String nomeSaga;

  public String getNomeSaga() {
    return nomeSaga;
  }

}
