package org.acme.resouce;

import java.util.List;

import org.acme.dto.PlataformaResponse;
import org.acme.dto.Plataformadto;
import org.acme.model.Plataforma;
import org.acme.service.Plataformaservice;

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

@Path("Plataforma")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Authenticated
public class Plataformaresource {
    
@Inject
Plataformaservice service;

    @POST
    @RolesAllowed({"Adm"})
    @Transactional
    public PlataformaResponse inserir(Plataformadto plataforma){
        return service.inserir(plataforma);
    }
    
    @PUT
    @Transactional
    @RolesAllowed({"Adm"})
    @Path("/{id}")
    public void  atualizar(@PathParam("id") Long id,Plataformadto plataforma){
        
        service.atualizar(id, plataforma);
    }
    
    @DELETE
    @Path("/{id}")
    @RolesAllowed({"Adm"})
    @Transactional
    public void deletar(@PathParam("id") Long id){
        service.deletar(id);
    }
    
    @GET
    @Path("id/{id}")
    @RolesAllowed({"Adm"})
    public PlataformaResponse procuraid(@PathParam("id") Long id){
        return service.procura_id(id);
    }
    
    @GET
    @Path("/nome/{nome}")
    @RolesAllowed({"Adm"})
    public PlataformaResponse procuranome(@PathParam("nome") String nome){
        return service.procura_nome(nome);
    }
    
    
    @GET
    @Path("/procuratodos")
    @RolesAllowed({"Adm"})
    public List<Plataforma> procuratodos(@QueryParam("page") @DefaultValue("0") int page,
    @QueryParam("pageSize") @DefaultValue("100") int pageSize) { 
        return service.procura_todos(page, pageSize);
    }
    
    @GET
    @Path("/count")
    @RolesAllowed({"Adm"})
    public Long count() { 
        return service.count();
    }
}
