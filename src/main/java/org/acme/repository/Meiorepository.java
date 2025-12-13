package org.acme.repository;

import org.acme.model.MeioPagamento;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Meiorepository implements PanacheRepository<MeioPagamento> {

    public MeioPagamento acharPorNome(String nome){
        return find("SELECT m FROM MeioPagamento m WHERE m.nome = ?1", nome).firstResult();
    }
}