package org.acme.repository;

import org.acme.model.Cartucho;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Cartuchorepository implements PanacheRepository<Cartucho> {
    /* 
   public Cartucho acharPorNome(String nome){
          return find("SELECT e FROM Cartucho e WHERE e.nomeCartucho = ?1 ", nome).firstResult();
   }  */
}
