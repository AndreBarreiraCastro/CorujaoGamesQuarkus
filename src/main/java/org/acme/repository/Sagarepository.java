package org.acme.repository;

import org.acme.model.Saga;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Sagarepository implements PanacheRepository<Saga> {
    
   public Saga acharPorNome(String nome){
          return find("SELECT e FROM Saga e WHERE e.nomeSaga = ?1 ", nome).firstResult();
   } 
}
