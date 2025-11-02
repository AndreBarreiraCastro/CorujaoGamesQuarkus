package org.acme.resouce;

import java.util.List;

import org.acme.dto.EstoqueResponse;
import org.acme.dto.Estoquedto;
import org.acme.model.Estoque;
import org.acme.service.Estoqueservice;

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

@Path("Estoque")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Estoqueresource {

    @Inject
    Estoqueservice service;

    @POST
    @Transactional
    public EstoqueResponse inserir(Estoquedto estoque) {
        return service.inserir(estoque);
    }

    @PUT
    @Transactional
    @Path("/{id}")
    public void atualizar(@PathParam("id") Long id, Estoquedto estoque) {

        service.atualizar(id, estoque);
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void deletar(@PathParam("id") Long id) {
        service.deletar(id);
    }

    @GET
    @Path("id/{id}")
    public EstoqueResponse procuraid(@PathParam("id") Long id) {
        return service.procura_id(id);
    }
    
    @GET
    @Path("procuratodos")
    public List<Estoque> procuratodos(@QueryParam("page") @DefaultValue("0") int page,
    
    @QueryParam("pageSize") @DefaultValue("100") int pageSize) {
        return service.procura_todos(page, pageSize);
    }
    
        @GET
        @Path("count")
        public Long count() {
            return service.count();
        }
        
    
}
