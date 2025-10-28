package org.acme.resouce;

import java.util.List;

import org.acme.dto.CartuchoResponse;
import org.acme.dto.Cartuchodto;
import org.acme.repository.Cartuchorepository;
import org.acme.service.Cartuchoservice;

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
import jakarta.ws.rs.core.Response;

@Path("/cartuchos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Cartuchoresource {

    @Inject
    Cartuchorepository repository;
    @Inject
    Cartuchoservice service;

    /*
     * @GET
     * public List<Cartuchodto> getAll() {
     * return repository.listAll() // PanacheEntity
     * .stream()
     * .map(this::todto)
     * .collect(Collectors.toList());
     * }
     */

    @POST
    @Transactional
    public Response create(Cartuchodto dto) {
        service.inserir(dto);
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Transactional
    @Path("/{id}")
    public void atualizar(@PathParam("id") Long id, Cartuchodto cartucho) {

        service.atualizar(id, cartucho);
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void deletar(@PathParam("id") Long id) {
        service.deletar(id);
    }

    @GET
    @Path("id/{id}")
    public CartuchoResponse procuraid(@PathParam("id") Long id) {
        return service.procura_id(id);
    }

    @GET
    public List<CartuchoResponse> procuratodos(@QueryParam("page") @DefaultValue("0") int page,
            @QueryParam("page_size") @DefaultValue("100") int pageSize) {
        return service.procura_todos(page, pageSize);
    }
}
