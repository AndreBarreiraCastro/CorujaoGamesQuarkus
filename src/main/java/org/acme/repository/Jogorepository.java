package org.acme.repository;

import org.acme.model.Jogo;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Jogorepository implements PanacheRepository<Jogo> {
}
