package org.acme.repository;

import org.acme.model.Pessoa;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Pessoarepository implements PanacheRepository<Pessoa> {
    /* 
   public Cartucho acharPorNome(String nome){
          return find("SELECT e FROM Cartucho e WHERE e.nomeCartucho = ?1 ", nome).firstResult();
   }  */
}
