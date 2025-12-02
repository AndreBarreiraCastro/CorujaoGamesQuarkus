package org.acme.dto;

import jakarta.validation.constraints.NotNull;

public class Enderecodto {
    
    @NotNull(message = "O nome deve ser informado (back).")
    private String logradouro;
    @NotNull(message = "O nome deve ser informado (back).")
    private String numero;
    @NotNull(message = "O nome deve ser informado (back).")
    private String cep;
    @NotNull(message = "O nome deve ser informado (back).")
    private Long enderecoMunicipio;

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getCep() {
        return cep;
    }

    public Long getEnderecoMunicipio() {
        return enderecoMunicipio;
    }

                            
}
