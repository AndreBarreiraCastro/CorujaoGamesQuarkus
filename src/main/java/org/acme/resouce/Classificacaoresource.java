package org.acme.resouce;

import java.util.List;

import org.acme.dto.ClassificacaoResponse;
import org.acme.dto.Classificacaodto;
import org.acme.model.Classificacao;
import org.acme.service.Classificacaoservice;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
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

@Path("Classificacao")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Classificacaoresource {

    @Inject
    Classificacaoservice service;

    @POST
    @Transactional
    public ClassificacaoResponse inserir(@Valid Classificacaodto classificacao) {
        return service.inserir(classificacao);
    }

    @PUT
    @Transactional
    @Path("/{id}")
    public void atualizar(@PathParam("id") Long id, Classificacaodto classificacao) {

        service.atualizar(id, classificacao);
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void deletar(@PathParam("id") Long id) {
        service.deletar(id);
    }

    @GET
    @Path("id/{id}")
    public ClassificacaoResponse procuraid(@PathParam("id") Long id) {
        return service.procura_id(id);
    }
    
    @GET
    @Path("procuratodos")
    public List<Classificacao>
    procuratodos(@QueryParam("page") @DefaultValue("0") int page,@QueryParam("pageSize") @DefaultValue("100") int pageSize) {
        return service.procura_todos(page, pageSize);
    }
    
        @GET
        @Path("count")
        public Long count() {
            return service.count();
        }
        
    
}
