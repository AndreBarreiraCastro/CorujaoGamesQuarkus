package org.acme.dto;

import org.acme.model.Estado;

import jakarta.validation.constraints.NotNull;

public  class Municipiodto {

    @NotNull(message = "O nome do municipio nao pode ser nulo")
    private  String nome;
    
    @NotNull(message = "O Estado do Municipio  nao pode ser nulo")
    private  Estado estadoMunicipio;

    public String getNome() {
        return nome;
    }

    public Estado getEstadoMunicipio() {
        return estadoMunicipio;
    }
 
}
