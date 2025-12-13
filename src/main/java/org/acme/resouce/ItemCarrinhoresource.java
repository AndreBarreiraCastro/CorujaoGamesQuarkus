package org.acme.resouce;

import java.util.List;

import org.acme.dto.ItemCarrinhoResponse;
import org.acme.dto.ItemCarrinhodto;
import org.acme.model.ItemCarrinho;
import org.acme.service.ItemCarrinhoservice;

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

@Path("ItemCarrinho")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ItemCarrinhoresource {

    @Inject
    ItemCarrinhoservice service;

    @POST
    @Transactional
    public ItemCarrinhoResponse inserir(ItemCarrinhodto dto) {
        return service.inserir(dto);
    }

    @PUT
    @Transactional
    @Path("/{id}")
    public void atualizar(@PathParam("id") Long id, ItemCarrinhodto dto) {
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
    public ItemCarrinhoResponse procuraid(@PathParam("id") Long id) {
        return service.procura_id(id);
    }

    @GET
    @Path("porCarrinho/{carrinhoId}")
    public List<ItemCarrinho> porCarrinho(@PathParam("carrinhoId") Long carrinhoId) {
        return service.procura_todos_do_carrinho(carrinhoId);
    }

    @GET
    @Path("count")
    public Long count() {
        return service.count();
    }
}