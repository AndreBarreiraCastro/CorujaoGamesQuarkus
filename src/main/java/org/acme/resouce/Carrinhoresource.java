package org.acme.resouce;

import java.util.List;

import org.acme.dto.CarrinhoResponse;
import org.acme.dto.Carrinhodto;
import org.acme.model.Carrinho;
import org.acme.service.Carrinhoservice;

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

@Path("Carrinho")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Carrinhoresource {

    @Inject
    Carrinhoservice service;

    @POST
    @Transactional
    public CarrinhoResponse inserir(Carrinhodto dto) {
        return service.inserir(dto);
    }

    @PUT
    @Transactional
    @Path("/{id}")
    public void atualizar(@PathParam("id") Long id, Carrinhodto dto) {
        service.atualizar(id, dto);
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void deletar(@PathParam("id") Long id) {
        service.deletar(id);
    }

    @GET
    @Path("id/{id}")
    public CarrinhoResponse procuraid(@PathParam("id") Long id) {
        return service.procura_id(id);
    }

    @GET
    @Path("porUsuario/{usuarioId}")
    public CarrinhoResponse porUsuario(@PathParam("usuarioId") Long usuarioId) {
        return service.procura_por_usuario(usuarioId);
    }

    @GET
    @Path("procuratodos")
    @RolesAllowed({"Adm"})
    public List<Carrinho> procuratodos(@QueryParam("page") @DefaultValue("0") int page,
            @QueryParam("pageSize") @DefaultValue("100") int pageSize) {
        return service.procura_todos(page, pageSize);
    }

    @GET
    @Path("count")
    public Long count() {
        return service.count();
    }
}