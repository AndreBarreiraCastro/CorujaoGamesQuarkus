package org.acme.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Endereco extends DefaultEntity {

    @Column(length = 60, nullable = false)
    private String logradouro;
    @Column(length = 60, nullable = false)
    private String numero;
    @Column(length = 60, nullable = false)
    private String cep;
    @Column(length = 60, nullable = false)
    @ManyToOne
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
