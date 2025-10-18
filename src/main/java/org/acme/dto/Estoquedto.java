package org.acme.dto;

import jakarta.validation.constraints.NotNull;

public  class Estoquedto {

      @NotNull(message = "O estoque nao pode ser nulo")
    private  int estoque;

      public int getEstoque() {
        return estoque;
      }



    
}
