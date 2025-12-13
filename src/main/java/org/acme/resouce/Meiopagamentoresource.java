package org.acme.resouce;

import java.util.List;

import org.acme.dto.MeioResponse;
import org.acme.dto.Meiodto;
import org.acme.model.MeioPagamento;
import org.acme.service.Meioservice;

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

@Path("MeioPagamento")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Meiopagamentoresource {

    @Inject
    Meioservice service;

    @POST
    @Transactional
    @RolesAllowed({"Adm"})
    public MeioResponse inserir(Meiodto meio) {
        return service.inserir(meio);
    }

    @PUT
    @Transactional
    @Path("/{id}")
    @RolesAllowed({"Adm"})
    public void atualizar(@PathParam("id") Long id, Meiodto meio) {
        service.atualizar(id, meio);
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
    @RolesAllowed({"Adm","User"})
    public MeioResponse procuraid(@PathParam("id") Long id) {
        return service.procura_id(id);
    }

    @GET
    @Path("procuratodos")
    public List<MeioPagamento> procuratodos(@QueryParam("page") @DefaultValue("0") int page,
            @QueryParam("pageSize") @DefaultValue("100") int pageSize) {
        return service.procura_todos(page, pageSize);
    }

    @GET
    @Path("count")
    public Long count() {
        return service.count();
    }
}