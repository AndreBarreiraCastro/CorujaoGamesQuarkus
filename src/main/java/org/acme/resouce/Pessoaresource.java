package org.acme.resouce;

import java.util.List;

import org.acme.dto.PessoaResponse;
import org.acme.dto.Pessoadto;
import org.acme.model.Pessoa;
import org.acme.service.Pessoaservice;

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

@Path("Pessoa")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
//@Authenticated
public class Pessoaresource {
    
@Inject
Pessoaservice service;

    @POST
    @Transactional
    
    public PessoaResponse inserir(Pessoadto pessoa){
        return service.inserir(pessoa);
    }
    
    @PUT
    @Transactional
    @Path("/{id}")
    public void  atualizar(@PathParam("id") Long id,Pessoadto pessoa){
        
        service.atualizar(id, pessoa);
    }
    
    @DELETE
    @Path("/{id}")
  //  @RolesAllowed({"Adm"})
    @Transactional
    public void deletar(@PathParam("id") Long id){
        service.deletar(id);
        
    }
    
    @GET
    @Path("id/{id}")
  //  @RolesAllowed({"Adm"})
    public PessoaResponse procuraid(@PathParam("id") Long id){
        return service.procura_id(id);
    }
    
    /*   @GET
    @Path("/nome/{nome}")
    public PessoaResponse procuranome(@PathParam("nome") String nome){
        return service.procura_nome(nome);
        } */
       
       
       @GET
       @Path("/procuratodos")
  //     @RolesAllowed({"Adm"})
       public List<Pessoa> procuratodos(@QueryParam("page") @DefaultValue("0") int page,
       @QueryParam("pageSize") @DefaultValue("100") int pageSize) { 
           return service.procura_todos(page, pageSize);
        }
        
        @GET
        @Path("/count")
   //     @RolesAllowed({"Adm"})
    public Long count() { 
        return service.count();
    }
}
