package org.acme.dto;

import java.util.List;

import org.acme.model.Classificacao;
import org.acme.model.Estoque;
import org.acme.model.Jogo;
import org.acme.model.Midia;
import org.acme.model.Saga;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.validation.constraints.NotNull;

public record JogoResponse(
    Long id,
   String titulo,
   String genero,
 Double valorUnit,
   Saga jogoSaga,
   Classificacao jogoClassificacao,
   Estoque jogoEstoque,
   Midia jogoMidia
) {

    public static JogoResponse valueOf(Jogo jogo) {
        return new JogoResponse(
            jogo.getId(),
            jogo.getTitulo(),
            jogo.getGenero(),
            jogo.getPrecoUnit(),
            jogo.getJogoSaga(),
            jogo.getJogoClassificacao(),
            jogo.getJogoEstoque(),
            jogo.getJogoMidia());
    }
    
}
