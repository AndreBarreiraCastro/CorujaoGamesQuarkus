package org.acme.dto;

import org.acme.model.Classificacao;
import org.acme.model.Estoque;
import org.acme.model.Midia;
import org.acme.model.Saga;

import jakarta.validation.constraints.NotNull;

public class Jogodto {

  @NotNull(message = "O titulo deve ser informado.")
  private String titulo;
  
  @NotNull(message = "O genero deve ser informado.")
  private String genero;
  
  @NotNull(message = "O valor deve ser informado.")
  private Double valorUnit;
  
  @NotNull(message = "A  Saga deve ser informado.")
  private Saga jogoSaga;
  
  @NotNull(message = "A  Classifição não foi escolhida.")
  private Classificacao jogoClassificacao;
  
  @NotNull(message = "O Estoque não foi escolhido.")
  private Estoque jogoEstoque;
  
  @NotNull(message = "O tipo Midia não foi escolhido.")
  private Midia jogoMidia;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(Double valorUnit) {
        this.valorUnit = valorUnit;
    }

    public Saga getJogoSaga() {
        return jogoSaga;
    }

    public void setJogoSaga(Saga jogoSaga) {
        this.jogoSaga = jogoSaga;
    }

    public Classificacao getJogoClassificacao() {
        return jogoClassificacao;
    }

    public void setJogoClassificacao(Classificacao jogoClassificacao) {
        this.jogoClassificacao = jogoClassificacao;
    }

    public Estoque getJogoEstoque() {
        return jogoEstoque;
    }

    public void setJogoEstoque(Estoque jogoEstoque) {
        this.jogoEstoque = jogoEstoque;
    }

    public Midia getJogoMidia() {
        return jogoMidia;
    }

    public void setJogoMidia(Midia jogoMidia) {
        this.jogoMidia = jogoMidia;
    }
}
