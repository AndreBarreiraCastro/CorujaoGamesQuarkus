package org.acme.repository;

import org.acme.model.Plataforma;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Plataformarepository implements PanacheRepository<Plataforma> {

   public Plataforma acharPorNome(String nome){
          return find("SELECT e FROM Plataforma e WHERE e.nomePlataforma = ?1 ", nome).firstResult();
   } 
}
