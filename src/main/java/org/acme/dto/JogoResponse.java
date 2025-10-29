package org.acme.dto;

import java.util.List;

import org.acme.model.Classificacao;
import org.acme.model.Estoque;
import org.acme.model.Jogo;
import org.acme.model.Midia;
import org.acme.model.Plataforma;
import org.acme.model.Saga;

import io.quarkus.hibernate.orm.panache.PanacheQuery;

public record JogoResponse(
        Long id,
        String titulo,
        String genero,
        Double valorUnit,
        Midia midia,
        Saga jogoSaga,
        Classificacao jogoClassificacao,
        Estoque jogoEstoque,
        List<Plataforma> jogoPlataforma) {

    public static JogoResponse valueOf(Jogo jogo) {
        return new JogoResponse(
                jogo.getId(),
                jogo.getTitulo(),
                jogo.getGenero(),
                jogo.getPrecoUnit(),
                jogo.getJogoMidia(),
                jogo.getJogoSaga(),
                jogo.getJogoClassificacao(),
                jogo.getJogoEstoque(),
                jogo.getJogoPlataforma());
    }

    public static List<JogoResponse> valueOf1(PanacheQuery<Jogo> jogo) {
        return jogo.stream()
                .map(e -> new JogoResponse(
                        e.getId(),
                        e.getTitulo(),
                        e.getGenero(),
                        e.getPrecoUnit(),
                        e.getJogoMidia(),
                        e.getJogoSaga(),
                        e.getJogoClassificacao(),
                        e.getJogoEstoque(),
                        e.getJogoPlataforma()))
                .toList();
    }

}
