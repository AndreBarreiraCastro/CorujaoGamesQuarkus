package org.acme.resouce;

import java.util.List;

import org.acme.dto.ClassificacaoResponse;
import org.acme.dto.Classificacaodto;
import org.acme.model.Classificacao;
import org.acme.service.Classificacaoservice;

import io.quarkus.security.Authenticated;
import jakarta.annotation.security.RolesAllowed;
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
@Authenticated
public class Classificacaoresource {

    @Inject
    Classificacaoservice service;

    @POST
    @Transactional
    @RolesAllowed({"Adm"})
    public ClassificacaoResponse inserir(@Valid Classificacaodto classificacao) {
        return service.inserir(classificacao);
    }
    
    @PUT
    @Transactional
    @Path("/{id}")
    @RolesAllowed({"Adm"})
    public void atualizar(@PathParam("id") Long id, Classificacaodto classificacao) {
        
        service.atualizar(id, classificacao);
    }
    
    @DELETE
    @Path("/{id}")
    @Transactional
    @RolesAllowed({"Adm"})
    public void deletar(@PathParam("id") Long id) {
        service.deletar(id);
    }
    
    @GET
    @Path("id/{id}")
    @RolesAllowed({"Adm"})
    public ClassificacaoResponse procuraid(@PathParam("id") Long id) {
        return service.procura_id(id);
    }
    
    @GET
    @Path("procuratodos")
    @RolesAllowed({"Adm"})
    public List<Classificacao>
    procuratodos(@QueryParam("page") @DefaultValue("0") int page,@QueryParam("pageSize") @DefaultValue("100") int pageSize) {
        return service.procura_todos(page, pageSize);
    }
    
    @GET
    @Path("count")
  @RolesAllowed({"Adm"})
    public Long count() {
        return service.count();
    }
    
    
}
