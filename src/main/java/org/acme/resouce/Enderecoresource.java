package org.acme.resouce;

import java.util.List;

import org.acme.dto.EnderecoResponse;
import org.acme.dto.Enderecodto;
import org.acme.model.Endereco;
import org.acme.service.Enderecoservice;

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

@Path("Endereco")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
//@Authenticated
public class Enderecoresource {
    
@Inject
Enderecoservice service;

    @POST
    @Transactional
  //  @RolesAllowed({"Adm","User"})
    public EnderecoResponse inserir(Enderecodto endereco){
        return service.inserir(endereco);
    }
    
    @PUT
    @Transactional
  //  @RolesAllowed({"Adm","User"})
    @Path("/{id}")
    public void  atualizar(@PathParam("id") Long id,Enderecodto endereco){
        
        service.atualizar(id, endereco);
    }
    
    @DELETE
    @Path("/{id}")
  //  @RolesAllowed({"Adm","User"})
    @Transactional
    public void deletar(@PathParam("id") Long id){
        service.deletar(id);
    }
    
    @GET
    @Path("id/{id}")
   // @RolesAllowed({"Adm","User"})
    public EnderecoResponse procuraid(@PathParam("id") Long id){
        return service.procura_id(id);
    }
    
    /*   @GET
    @Path("/nome/{nome}")
    public EnderecoResponse procuranome(@PathParam("nome") String nome){
        return service.procura_nome(nome);
        } */
       
       
       @GET
       @Path("/procuratodos")
    //   @RolesAllowed({"Adm","User"})
       public List<Endereco> procuratodos(@QueryParam("page") @DefaultValue("0") int page,
       @QueryParam("pageSize") @DefaultValue("100") int pageSize) { 
           return service.procura_todos(page, pageSize);
        }
        
        @GET
        @Path("/count")
    //    @RolesAllowed({"Adm","User"})
    public Long count() { 
        return service.count();
    }
}
