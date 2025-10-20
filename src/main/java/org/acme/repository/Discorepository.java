package org.acme.repository;

import org.acme.model.Disco;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Discorepository implements PanacheRepository<Disco> {
    /* 
   public Disco acharPorNome(String nome){
          return find("SELECT e FROM Disco e WHERE e.nomeDisco = ?1 ", nome).firstResult();
   } */ 
}
