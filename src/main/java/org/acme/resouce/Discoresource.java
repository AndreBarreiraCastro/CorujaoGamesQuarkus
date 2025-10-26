package org.acme.resouce;

import org.acme.dto.Discodto;
import org.acme.model.Disco;
import org.acme.repository.Discorepository;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/discos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Discoresource {

@Inject Discorepository repository;

  /*   @GET
    public List<Discodto> getAll() {
        return repository.listAll() // PanacheEntity
            .stream()
            .map(this::todto)
            .collect(Collectors.toList());
    } */

    @POST
    @Transactional
    public Response create(Discodto dto) {
        Disco disco = new Disco();
        disco.setDesenvolvedora(dto.getDesenvolvedora());
        disco.setModoJogo(dto.getModoJogo());
        repository.persist(disco);
        return Response.status(Response.Status.CREATED).entity(toDTO(disco)).build();
    }

    // Converter entidade → DTO
    private Discodto toDTO(Disco disco) {
        Discodto dto = new Discodto();
        dto.setDesenvolvedora(disco.getDesenvolvedora());
        dto.setModoJogo(disco.getModoJogo());
        return dto;
    }
}
