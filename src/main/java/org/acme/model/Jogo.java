package org.acme.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Jogo extends DefaultEntity {

    @Column(length = 60, nullable = false)
    private String titulo;

    @Column(length = 60, nullable = false)
    private String genero;

    @Column(length = 60, nullable = false)
    private Double precoUnit;

    @ManyToMany
    @JoinTable(name = "Jogo_saga", // nome da tabela intermediária
            joinColumns = @JoinColumn(name = "Jogo_id"), // FK de Jogo
            inverseJoinColumns = @JoinColumn(name = "Saga_id") // FK de Saga
    )
    private List<Saga> jogoSaga;

    @ManyToOne
    @JoinColumn(name = "classificacao_id", nullable = false)
    private Classificacao jogoClassificacao;

    @OneToOne
    @JoinColumn(name = "estoque_id", nullable = false)
    private Estoque jogoEstoque;

    @ManyToOne
    @JoinColumn(name = "midia_id", nullable = false)
    private Midia jogoMidia;

    public Midia getJogoMidia() {
        return jogoMidia;
    }

    public void setJogoMidia(Midia jogoMidia) {
        this.jogoMidia = jogoMidia;
    }

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

    public Double getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(Double precoUnit) {
        this.precoUnit = precoUnit;
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

    public List<Saga> getJogoSaga() {
        return jogoSaga;
    }

    public void setJogoSaga(List<Saga> jogoSaga) {
        this.jogoSaga = jogoSaga;
    }

}
