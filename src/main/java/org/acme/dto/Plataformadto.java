package org.acme.dto;

import jakarta.validation.constraints.NotNull;

public  class Plataformadto {

      @NotNull(message = "O nome deve ser informado (back).")
    private  String nomePlataforma;

      public String getNomePlataforma() {
        return nomePlataforma;
      }



    
}
