package org.acme.repository;

import org.acme.model.Colecao;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Colecaorepository implements PanacheRepository<Colecao> {
   public Colecao acharPorNome(String nome){
          return find("SELECT e FROM Colecao e WHERE e.nomeColecao = ?1 ", nome).firstResult();
   } 
}
