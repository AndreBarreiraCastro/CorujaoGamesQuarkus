package org.acme.repository;

import org.acme.model.Midia;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Midiarepository implements PanacheRepository<Midia> {
}
