package org.acme.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Jogo extends DefaultEntity {
    
    @Column(length = 60,nullable = false)
    private String titulo;
    
    @Column(length = 60,nullable = false)
    private String genero;
    
    @Column(length = 60,nullable = false)
    private Double precoUnit;
    
    
    @ManyToMany()
    @Column(length = 60,nullable = false)
    private Saga jogoSaga;
    
    @ManyToOne()
    @Column(length = 60,nullable = false)
    private Classificacao jogoClassificacao;
    
    @OneToOne()
    private Estoque jogoEstoque;
    
    
    @ManyToOne()
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

    public Double getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(Double precoUnit) {
        this.precoUnit = precoUnit;
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
