package org.acme.resouce;

import java.util.List;

import org.acme.dto.SagaResponse;
import org.acme.dto.Sagadto;
import org.acme.model.Saga;
import org.acme.service.Sagaservice;

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
public class Sagaresource {

    @Inject
    Sagaservice service;

    @POST
    @Transactional
    public SagaResponse inserir(Sagadto saga) {
        return service.inserir(saga);
    }

    @PUT
    @Transactional
    @Path("/{id}")
    public void atualizar(@PathParam("id") Long id, Sagadto saga) {

        service.atualizar(id, saga);
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void deletar(@PathParam("id") Long id) {
        service.deletar(id);
    }

    @GET
    @Path("id/{id}")
    public SagaResponse procuraid(@PathParam("id") Long id) {
        return service.procura_id(id);
    }

    @GET
    @Path("/nome/{nome}")
    public SagaResponse procuranome(@PathParam("nome") String nome) {
        return service.procura_nome(nome);
    }
    
    @GET
    @Path("/procuratodos")
    public List<Saga> procuratodos(@QueryParam("page") @DefaultValue("0") int page,
    @QueryParam("pageSize") @DefaultValue("100") int pageSize) {
        return service.procura_todos(page, pageSize);
    }
    
    @GET
    @Path("/count")
    public Long count() {
        return service.count();
    }
}
