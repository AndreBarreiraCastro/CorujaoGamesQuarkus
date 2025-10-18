package org.acme.dto;

import org.acme.model.Classificacao;

public record ClassificacaoResponse(
    Long id,
    Integer classificacao,
    String descricao
) {

    public static ClassificacaoResponse valueOf(Classificacao classificacao) {
        return new ClassificacaoResponse(
            classificacao.getId(),
            classificacao.getIdademinima(),
            classificacao.getDescricao());
    }
}
