package org.acme.dto;

import org.acme.model.Municipio;

import jakarta.validation.constraints.NotNull;

public class Enderecodto {
    
    @NotNull(message = "O nome deve ser informado (back).")
    private String logradouro;
    @NotNull(message = "O nome deve ser informado (back).")
    private String numero;
    @NotNull(message = "O nome deve ser informado (back).")
    private String cep;
    @NotNull(message = "O nome deve ser informado (back).")
    private Municipio enderecoMunicipio;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Municipio getEnderecoMunicipio() {
        return enderecoMunicipio;
    }

    public void setEnderecoMunicipio(Municipio enderecoMunicipio) {
        this.enderecoMunicipio = enderecoMunicipio;
    }

    
                            
}
