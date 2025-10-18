package org.acme.repository;

import org.acme.model.Classificacao;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Classificacaorepository implements PanacheRepository<Classificacao> {
}
