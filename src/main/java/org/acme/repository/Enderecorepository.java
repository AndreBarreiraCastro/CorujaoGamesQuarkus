package org.acme.repository;

import org.acme.model.Endereco;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Enderecorepository implements PanacheRepository<Endereco> {
    /* 
   public Cartucho acharPorNome(String nome){
          return find("SELECT e FROM Cartucho e WHERE e.nomeCartucho = ?1 ", nome).firstResult();
   }  */
}
