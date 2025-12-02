package org.acme.repository;

import org.acme.model.Municipio;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Municipiorepository implements PanacheRepository<Municipio> {
    /* 
   public Municipio acharPorNome(String nome){
          return find("SELECT e FROM Municipio e WHERE e.nomeMunicipio = ?1 ", nome).firstResult();
   }  */
}
