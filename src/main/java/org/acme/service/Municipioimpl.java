package org.acme.service;

import java.util.List;

import org.acme.dto.MunicipioResponse;
import org.acme.dto.Municipiodto;
import org.acme.model.Municipio;
import org.acme.repository.Municipiorepository;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;

@ApplicationScoped
public class Municipioimpl implements Municipioservice {

    @Inject
    Municipiorepository repository;


    @Override
    public MunicipioResponse inserir(Municipiodto municipio) {

        validarDados(municipio,null);
        Municipio novo = new Municipio();
        novo.setNome(municipio.getNome());
        novo.setEstadoMunicipio(municipio.getEstadoMunicipio());
        repository.persist(novo);
        return MunicipioResponse.valueOf(novo);
    }



    @Override
    @Transactional
    public void atualizar(Long id, Municipiodto municipio) {
        Municipio existente = repository.findById(id);

        if (existente == null) {
            throw new NotFoundException("Municipio com ID " + id + " não encontrado.");
        }

        // Atualiza somente os campos que podem ser alterados
        existente.setNome(municipio.getNome());
        existente.setEstadoMunicipio(municipio.getEstadoMunicipio());
        repository.persist(existente);
    }

    @Override
    public void deletar(Long id) {
        repository.delete(repository.findById(id));
    }

    @Override
    public MunicipioResponse procura_id(Long id) {
        return MunicipioResponse.valueOf(repository.findById(id));
    }



    @Override
    public List<Municipio> procura_todos(Integer page, Integer pageSize) {
        PanacheQuery<Municipio> query = null;
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

    private void validarDados(Municipiodto dto, Long id) {
        
    }


}
