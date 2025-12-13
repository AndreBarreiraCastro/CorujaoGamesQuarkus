package org.acme.resouce;

import java.util.List;

import org.acme.dto.MunicipioResponse;
import org.acme.dto.Municipiodto;
import org.acme.model.Municipio;
import org.acme.service.Municipioservice;

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

@Path("Municipio")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
//@Authenticated
public class Municipioresource {
    
@Inject
Municipioservice service;

    @POST
    @Transactional
    @RolesAllowed({"Adm"})
    public MunicipioResponse inserir(Municipiodto endereco){
        return service.inserir(endereco);
    }
    
    @PUT
    @Transactional
    @Path("/{id}")
    @RolesAllowed({"Adm"})
    public void  atualizar(@PathParam("id") Long id,Municipiodto endereco){
        
        service.atualizar(id, endereco);
    }
    
    @DELETE
    @Path("/{id}")
    @Transactional
    @RolesAllowed({"Adm"})
    public void deletar(@PathParam("id") Long id){
        service.deletar(id);
    }
    
    @GET
    @Path("id/{id}")
    @RolesAllowed({"Adm"})
    public MunicipioResponse procuraid(@PathParam("id") Long id){
        return service.procura_id(id);
    }
    
    /*   @GET
    @Path("/nome/{nome}")
    public MunicipioResponse procuranome(@PathParam("nome") String nome){
        return service.procura_nome(nome);
        } */
       
       
       @GET
       @Path("/procuratodos")
     //  @RolesAllowed({"Adm"})
       public List<Municipio> procuratodos(@QueryParam("page") @DefaultValue("0") int page,
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
