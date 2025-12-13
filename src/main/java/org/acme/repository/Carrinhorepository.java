package org.acme.repository;

import org.acme.model.Carrinho;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Carrinhorepository implements PanacheRepository<Carrinho> {
    public Carrinho acharPorUsuarioId(Long usuarioId) {
        return find("SELECT c FROM Carrinho c WHERE c.usuario.id = ?1", usuarioId).firstResult();
    }
}