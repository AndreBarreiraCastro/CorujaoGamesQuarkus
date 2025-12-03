package org.acme.repository;

import org.acme.model.Usuario;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Usuariorepository implements PanacheRepository<Usuario> {

    public Usuario findByUsernameAndSenha(String username, String senha){
        if (username == null || senha == null)
            return null;
            
        return find("username = ?1 AND senha = ?2 ", username, senha).firstResult();
    }
}
