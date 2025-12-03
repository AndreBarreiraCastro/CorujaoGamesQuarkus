package org.acme.dto;

import java.util.List;

import org.acme.model.Endereco;
import org.acme.model.Pessoa;

import io.quarkus.hibernate.orm.panache.PanacheQuery;

public record PessoaResponse(
        Long id,
        String nome,
        String sobrenome,
        String cpf,
        String telefone,
        Endereco enderecoPessoa,
        String username,
        String perfil) {

    public static PessoaResponse valueOf(Pessoa pessoa) {
        return new PessoaResponse(
                pessoa.getId(),
                pessoa.getNome(),
                pessoa.getSobrenome(),
                pessoa.getCpf(),
                pessoa.getTelefone(),
                pessoa.getEnderecoPessoa(),
                pessoa.getUsername(),
                pessoa.getPerfil().getLabel()
        );
}

public static List<PessoaResponse> valueOf1(PanacheQuery<Pessoa> jogo) {
        return jogo.stream()
        .map(e -> new PessoaResponse(
                e.getId(),
                e.getNome(),
                e.getSobrenome(),
                e.getCpf(),
                e.getTelefone(),
                e.getEnderecoPessoa(),
                e.getUsername(),
                e.getPerfil().getLabel()))
                .toList();
    }

}
