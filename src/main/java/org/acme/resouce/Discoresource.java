package org.acme.resouce;

import java.util.List;

import org.acme.dto.DiscoResponse;
import org.acme.dto.Discodto;
import org.acme.service.Discoservice;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/discos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Discoresource {

    @Inject
    Discoservice service;

    /*
     * @GET
     * public List<Discodto> getAll() {
     * return repository.listAll() // PanacheEntity
     * .stream()
     * .map(this::todto)
     * .collect(Collectors.toList());
     * }
     */

    @POST
    @Transactional
    public DiscoResponse create(Discodto dto) {
        return service.inserir(dto);
    }

     @PUT
    @Transactional
    @Path("/{id}")
    public void atualizar(@PathParam("id") Long id, Discodto disco) {

        service.atualizar(id, disco);
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void deletar(@PathParam("id") Long id) {
        service.deletar(id);
    }

    @GET
    @Path("id/{id}")
    public DiscoResponse procuraid(@PathParam("id") Long id) {
        return service.procura_id(id);
    }

    @GET
    public List<DiscoResponse> procuratodos(@QueryParam("page") @DefaultValue("0") int page,
            @QueryParam("page_size") @DefaultValue("100") int pageSize) {
        return service.procura_todos(page, pageSize);
    }
}
