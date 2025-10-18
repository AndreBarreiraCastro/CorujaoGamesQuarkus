package org.acme.resouce;

import org.acme.dto.ClassificacaoResponse;
import org.acme.dto.Classificacaodto;
import org.acme.service.Classificacaoservice;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("Classificacao")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Classificacaoresource {

    @Inject
    Classificacaoservice service;

    @POST
    @Transactional
    public ClassificacaoResponse inserir(@Valid Classificacaodto estoque) {
        return service.inserir(estoque);
    }

    @PUT
    @Transactional
    @Path("/{id}")
    public void atualizar(@PathParam("id") Long id, Classificacaodto estoque) {

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
    public ClassificacaoResponse procuraid(@PathParam("id") Long id) {
        return service.procura_id(id);
    }
    /*
     * @GET
     * 
     * @Path("/nome/{nome}")
     * public ClassificacaoResponse procuranome(@PathParam("nome") String nome){
     * return service.procura_nome(nome);
     * }
     * 
     * 
     * @GET
     * public List<ClassificacaoResponse>
     * procuratodos(@QueryParam("page") @DefaultValue("0") int page,
     * 
     * @QueryParam("page_size") @DefaultValue("100") int pageSize) {
     * return service.procura_todos(page, pageSize);
     * }
     */
}
