package org.acme.resouce;

import org.acme.dto.PlataformaResponse;
import org.acme.dto.Plataformadto;
import org.acme.service.Plataformaservice;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("plataforma")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Plataformaresource {
    
@Inject
Plataformaservice service;

    @POST
    @Transactional
    public PlataformaResponse inserir(Plataformadto plataforma){
        return service.inserir(plataforma);
    }
    
    @PUT
    @Transactional
    @Path("/{id}")
    public void  atualizar(@PathParam("id") Long id,Plataformadto plataforma){

       service.atualizar(id, plataforma);
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void deletar(@PathParam("id") Long id){
        service.deletar(id);
    }

    @GET
    @Path("/{id}")
    public PlataformaResponse procuraid(@PathParam("id") Long id){
        return service.procura_id(id);
    }

    @GET
    @Path("/nome/{nome}")
    public PlataformaResponse procuranome(@PathParam("nome") String nome){
        return service.procura_nome(nome);
    }


}
