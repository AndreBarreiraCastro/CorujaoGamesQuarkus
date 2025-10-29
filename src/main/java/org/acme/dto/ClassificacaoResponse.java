package org.acme.dto;

import java.util.List;

import org.acme.model.Classificacao;

import io.quarkus.hibernate.orm.panache.PanacheQuery;

public record ClassificacaoResponse(
    Long id,
    Integer classificacao,
    String descricao
) {

    public static ClassificacaoResponse valueOf(Classificacao classificacao) {
        return new ClassificacaoResponse(
            classificacao.getId(),
            classificacao.getClassificacao(),
            classificacao.getDescricao());
    }
   public static List<ClassificacaoResponse> valueOf1(PanacheQuery<Classificacao> classificacao) {
        return classificacao.stream()
        .map(e -> new ClassificacaoResponse(
            e.getId(),
            e.getClassificacao(),
            e.getDescricao()))
        .toList();
    }  
}
