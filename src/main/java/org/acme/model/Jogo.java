package org.acme.model;

import java.util.List;

import jakarta.persistence.CascadeType;
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

    @ManyToOne
    @JoinColumn(name = "Jogo_saga")
    private Saga jogoSaga;


    private List<String> jogoImagem;

    @ManyToOne
    @JoinColumn(name = "jogoClassificacao_id", nullable = false)
    private Classificacao jogoClassificacao;

    @OneToOne
    @JoinColumn(name = "jogoEstoque_id", nullable = false)
    private Estoque jogoEstoque;

    @ManyToOne
    @JoinColumn(name = "jogoMidia_id", nullable = false)
    private Midia jogoMidia;

    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinTable(name = "jogo_plataforma", // nome da tabela de junção
            joinColumns = @JoinColumn(name = "jogo_id"), // FK para Jogo
            inverseJoinColumns = @JoinColumn(name = "plataforma_id"))
    private List<Plataforma> jogoPlataforma;

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

    public Saga getJogoSaga() {
        return jogoSaga;
    }

    public void setJogoSaga(Saga jogoSaga) {
        this.jogoSaga = jogoSaga;
    }

    public List<Plataforma> getJogoPlataforma() {
        return jogoPlataforma;
    }

    public void setJogoPlataforma(List<Plataforma> jogoPlataforma) {
        this.jogoPlataforma = jogoPlataforma;
    }

    public List<String> getJogoImagem() {
        return jogoImagem;
    }

    public void setJogoImagem(List<String> jogoImagem) {
        this.jogoImagem = jogoImagem;
    }

 

}
