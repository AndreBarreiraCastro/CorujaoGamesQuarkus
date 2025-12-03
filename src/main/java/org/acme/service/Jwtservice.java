package org.acme.service;

import org.acme.model.Usuario;

public interface Jwtservice {
    public String generateJwt(Usuario userPessoa);

}
