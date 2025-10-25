package org.acme.repository;

import org.acme.model.Jogo;
import org.acme.model.Saga;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Jogorepository implements PanacheRepository<Jogo> {

     public Jogo acharPorNome(String nome){
          return find("SELECT e FROM Jogo e WHERE e.titulo = ?1 ",nome).firstResult();
   } 
}
