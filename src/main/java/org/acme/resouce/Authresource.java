package org.acme.resouce;

import org.acme.dto.Authdto;
import org.acme.model.Usuario;
import org.acme.repository.Usuariorepository;
import org.acme.service.Hashservice;
import org.acme.service.Jwtservice;
import org.acme.service.Pessoaservice;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

@Path("/auth")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class Authresource {

    @Inject
    Hashservice hashService;

    @Inject
    Pessoaservice usuarioService;

    @Inject
    Jwtservice jwtService;
    @Inject
    Usuariorepository repository;

    @POST
    public Response login(Authdto authDTO) {
        String hash = hashService.getHashSenha(authDTO.getSenha());

        Usuario usuario = repository.findByUsernameAndSenha(authDTO.getLogin(), hash);

        if (usuario == null) {
            return Response.status(Status.NOT_FOUND)
                .entity("Usuario não encontrado").build();
        } 
        return Response.ok()
            .header("Authorization", jwtService.generateJwt(usuario))
            .build();
        
    }
  
}