package org.acme.resouce;

import java.util.List;

import org.acme.dto.ColecaoResponse;
import org.acme.dto.Colecaodto;
import org.acme.model.Colecao;
import org.acme.service.Colecaoservice;

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

@Path("Colecao")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Colecaoresource {

    @Inject
    Colecaoservice service;

    @POST
    @Transactional
    public ColecaoResponse inserir(Colecaodto colecao){
        return service.inserir(colecao);
    }
    
    @PUT
    @Transactional
    @Path("/{id}")
    public void  atualizar(@PathParam("id") Long id,Colecaodto colecao){

       service.atualizar(id, colecao);
    }

    
    @DELETE
    @Path("/{id}")
    @Transactional
    public void deletar(@PathParam("id") Long id){
        service.deletar(id);
    }

    @GET
    @Path("id/{id}")
    public ColecaoResponse procuraid(@PathParam("id") Long id){
        return service.procura_id(id);
    }

    @GET
    @Path("/nome/{nome}")
    public ColecaoResponse procuranome(@PathParam("nome") String nome){
        return service.procura_nome(nome);
    }

    @GET
    @Path("/procuratodos")
    public List<Colecao> procuratodos(@QueryParam("page") @DefaultValue("0") int page,
                                    @QueryParam("pageSize") @DefaultValue("100") int pageSize) { 
        return service.procura_todos(page, pageSize);
    }
    
    @GET
    @Path("/count")
    public Long count() { 
        return service.count();
    }
   
}
