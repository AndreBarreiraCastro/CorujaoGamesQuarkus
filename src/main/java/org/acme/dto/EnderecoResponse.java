package org.acme.dto;

import java.util.List;

import org.acme.model.Endereco;
import org.acme.model.Municipio;

import io.quarkus.hibernate.orm.panache.PanacheQuery;

public record EnderecoResponse(
        Long id,
        String logradouro,
        String numero,
        String cep,
        Municipio enderecoMunicipio

) {

    public static EnderecoResponse valueOf(Endereco endereco) {
        return new EnderecoResponse(
                endereco.getId(),
                endereco.getLogradouro(),
                endereco.getNumero(),
                endereco.getCep(),
                endereco.getEnderecoMunicipio());
    }

    public static List<EnderecoResponse> valueOf1(PanacheQuery<Endereco> endereco) {
        return endereco.stream()
                .map(e -> new EnderecoResponse(
                        e.getId(),
                        e.getLogradouro(),
                        e.getNumero(),
                        e.getCep(),
                        e.getEnderecoMunicipio()))
                .toList();
    }

}
