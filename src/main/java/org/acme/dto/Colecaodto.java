package org.acme.dto;

import jakarta.validation.constraints.NotNull;

public  class Colecaodto {

      @NotNull(message = "O nome deve ser informado (back).")
    private  String nomeColecao;

      public String getNomeColecao() {
          return nomeColecao;
      }

    
}
