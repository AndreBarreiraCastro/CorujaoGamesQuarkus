package org.acme.resouce;

import java.util.List;

import org.acme.dto.JogoResponse;
import org.acme.dto.Jogodto;
import org.acme.service.Jogoservice;

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

@Path("Jogo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
//@Authenticated
public class Jogoresource {

    @Inject
    Jogoservice service;

     @POST
    @Transactional
    @Path("/criar")
    @RolesAllowed({"Adm"})
    public JogoResponse inserir(Jogodto jogo) {
        return service.inserir(jogo);
    }

    @PUT
    @Transactional
    @Path("/alterar/{id}")
    @RolesAllowed({"Adm"})
    public void atualizar(@PathParam("id") Long id, Jogodto jogo) {

        service.atualizar(id, jogo);
    }

    @DELETE
    @Path("/{id}")
    @RolesAllowed({"Adm"})
    @Transactional
    public void deletar(@PathParam("id") Long id) {
        service.deletar(id);
    }

    @GET
    @Path("id/{id}")
    @RolesAllowed({"Adm"})
    public JogoResponse procuraid(@PathParam("id") Long id) {
        return service.procura_id(id);
    }

    /*
     * @GET
     * 
     * @Path("/nome/{nome}")
     * public JogoResponse procuranome(@PathParam("nome") String nome) {
     * return service.procura_nome(nome);
     * }
     */

    @GET
    @Path("procuratodos")
    //@RolesAllowed({"Adm","User"})
    public List<JogoResponse> procuratodos(@QueryParam("page") @DefaultValue("0") int page,
    @QueryParam("pageSize") @DefaultValue("100") int pageSize) {
        return service.procura_todos(page, pageSize);
    }
    
    @GET
    @Path("count")
    //@RolesAllowed({"Adm","User"})
    public Long count() {
        return service.count();
    }
}
