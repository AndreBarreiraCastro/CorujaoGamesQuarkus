package org.acme.service;

import java.time.Duration;
import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.acme.dto.PessoaResponse;
import org.acme.model.Pessoa;
import org.acme.model.Usuario;

import io.smallrye.jwt.build.Jwt;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class Jwtimpl implements Jwtservice {

      private static final Duration EXPIRATION_TIME = Duration.ofHours(24);

    @Override
    public String generateJwt(Usuario userPessoa) {
        Instant now = Instant.now();
        Instant expiryDate = now.plus(EXPIRATION_TIME);

        Set<String> roles = new HashSet<String>();
        roles.add(userPessoa.getPerfil().getLabel());

        return Jwt.issuer("unitins-jwt")
            .subject(userPessoa.getUsername())
            .groups(roles)
            .expiresAt(expiryDate)
            .sign();

    }
}
