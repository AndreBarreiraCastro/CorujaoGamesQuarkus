package org.acme.resouce;

import java.util.List;

import org.acme.dto.SagaResponse;
import org.acme.dto.Sagadto;
import org.acme.model.Saga;
import org.acme.service.Sagaservice;

import io.quarkus.security.Authenticated;
import jakarta.annotation.security.RolesAllowed;
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

@Path("Saga")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Authenticated
public class Sagaresource {

    @Inject
    Sagaservice service;

    @POST
    @RolesAllowed({"Adm"})
    @Transactional
    public SagaResponse inserir(Sagadto saga) {
        return service.inserir(saga);
    }
    
    @PUT
    @RolesAllowed({"Adm"})
    @Transactional
    @Path("/{id}")
    public void atualizar(@PathParam("id") Long id, Sagadto saga) {
        
        service.atualizar(id, saga);
    }
    
    @DELETE
    @RolesAllowed({"Adm"})
    @Path("/{id}")
    @Transactional
    public void deletar(@PathParam("id") Long id) {
        service.deletar(id);
    }
    
    @GET
    @RolesAllowed({"Adm"})
    @Path("id/{id}")
    public SagaResponse procuraid(@PathParam("id") Long id) {
        return service.procura_id(id);
    }
    
    @GET
    @RolesAllowed({"Adm"})
    @Path("/nome/{nome}")
    public SagaResponse procuranome(@PathParam("nome") String nome) {
        return service.procura_nome(nome);
    }
    
    @GET
    @RolesAllowed({"Adm"})
    @Path("/procuratodos")
    public List<Saga> procuratodos(@QueryParam("page") @DefaultValue("0") int page,
    @QueryParam("pageSize") @DefaultValue("100") int pageSize) {
        return service.procura_todos(page, pageSize);
    }
    
    @GET
    @RolesAllowed({"Adm"})
    @Path("/count")
    public Long count() {
        return service.count();
    }
    @GET
    @RolesAllowed({"Adm"})
    @Path("/todos")
    public List<SagaResponse> todos() {
        return service.procura();
    }
}
