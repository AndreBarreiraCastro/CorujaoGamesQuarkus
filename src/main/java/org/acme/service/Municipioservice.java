package org.acme.service;

import java.util.List;

import org.acme.dto.MunicipioResponse;
import org.acme.dto.Municipiodto;
import org.acme.model.Municipio;

import jakarta.validation.Valid;

public interface Municipioservice {
   MunicipioResponse inserir(@Valid Municipiodto municipio);

    void atualizar(Long id,Municipiodto municipio);

    void deletar(Long id);

   MunicipioResponse procura_id(Long id);

    List<Municipio> procura_todos(Integer page, Integer pageSize);

    Long count();

}
