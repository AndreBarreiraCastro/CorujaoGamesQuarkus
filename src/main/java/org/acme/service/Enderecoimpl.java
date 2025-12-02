package org.acme.service;

import java.util.List;

import org.acme.dto.EnderecoResponse;
import org.acme.dto.Enderecodto;
import org.acme.model.Endereco;
import org.acme.repository.Enderecorepository;
import org.acme.repository.Municipiorepository;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class Enderecoimpl implements Enderecoservice {

    @Inject
    Enderecorepository repository;
    @Inject
    Municipiorepository municipio;

    @Override
    public EnderecoResponse inserir(Enderecodto endereco) {
        
        validarDados(endereco, null);
        Endereco novo = new Endereco();
        novo.setLogradouro(endereco.getLogradouro());
        novo.setNumero(endereco.getNumero());
        novo.setCep(endereco.getCep());
        novo.setEnderecoMunicipio(municipio.findById(endereco.getEnderecoMunicipio()));
        repository.persist(novo);
        return EnderecoResponse.valueOf(novo);
    }

    @Override
    public void atualizar(Long id, Enderecodto endereco) {
        Endereco atualizado = repository.findById(id);
        atualizado.setLogradouro(endereco.getLogradouro());
        atualizado.setNumero(endereco.getNumero());
        atualizado.setCep(endereco.getCep());
        atualizado.setEnderecoMunicipio(municipio.findById(endereco.getEnderecoMunicipio()));
        repository.persist(atualizado);
    }

    @Override
    public void deletar(Long id) {
        repository.deleteById(id);
    }

    @Override
    public EnderecoResponse procura_id(Long id) {
        Endereco achado = repository.findById(id);
        return EnderecoResponse.valueOf(achado);
    }

  /*   @Override
    public EnderecoResponse procura_nome(String nome) {
        Endereco achado = repository.acharPorNome(nome);
        return EnderecoResponse.valueOf(achado);
    } */

    @Override
    public List<Endereco> procura_todos(Integer page, Integer pageSize) {
        PanacheQuery<Endereco> query = null;
        if (page == null || pageSize == null)
            query = repository.findAll();
        else
            query = repository.findAll().page(page, pageSize);

        return query.list();
    }

    @Override
    public Long count() {

        return repository.count();

    }

            private void validarDados(Enderecodto dto, Long id) {
        
    }
}
