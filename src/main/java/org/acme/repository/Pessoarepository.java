package org.acme.repository;

import java.util.List;

import org.acme.dto.PessoaResponse;
import org.acme.model.Pessoa;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Pessoarepository implements PanacheRepository<Pessoa> {
     public List<Pessoa> findByNome(String nome) {
        return find("UPPER(nome) LIKE UPPER(?1) ", "%"+nome+"%").list();
    }

    public Pessoa findByUsername(String login) {
        return find("username = ?1 ", login).firstResult();
    }

    public PessoaResponse findByUsernameAndSenha(String username, String senha){
        if (username == null || senha == null)
            return null;
            
        return PessoaResponse.valueOf(find("username = ?1 AND senha = ?2 ", username, senha).firstResult());
    }
}
