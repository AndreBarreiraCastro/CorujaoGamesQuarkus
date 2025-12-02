package org.acme.service;

import java.util.List;

import org.acme.dto.PessoaResponse;
import org.acme.dto.Pessoadto;
import org.acme.model.Pessoa;
import org.acme.repository.Enderecorepository;
import org.acme.repository.Pessoarepository;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class Pessoaimpl implements Pessoaservice {

    @Inject
    Pessoarepository repository;
    @Inject
    Enderecorepository endereco;

    @Override
    public PessoaResponse inserir(Pessoadto pessoa) {
        
        validarDados(pessoa, null);
        Pessoa novo = new Pessoa();
        novo.setNome(pessoa.getNome());
        novo.setSobrenome(pessoa.getSobrenome());
        novo.setCpf(pessoa.getCpf());
        novo.setUsername(pessoa.getUsername());
        novo.setSenha(pessoa.getSenha());
        novo.setTelefone(pessoa.getTelefone());
        novo.setEnderecoPessoa(endereco.findById(pessoa.getEnderecoPessoa()));
        repository.persist(novo);
        return PessoaResponse.valueOf(novo);
    }

    @Override
    public void atualizar(Long id, Pessoadto pessoa) {
        Pessoa atualizado = repository.findById(id);
        atualizado.setNome(pessoa.getNome());
        atualizado.setSobrenome(pessoa.getSobrenome());
        atualizado.setCpf(pessoa.getCpf());
        atualizado.setUsername(pessoa.getUsername());
        atualizado.setSenha(pessoa.getSenha());
        atualizado.setTelefone(pessoa.getTelefone());
        atualizado.setEnderecoPessoa(endereco.findById(pessoa.getEnderecoPessoa()));
        repository.persist(atualizado);
    }

    @Override
    public void deletar(Long id) {
        repository.deleteById(id);
    }

    @Override
    public PessoaResponse procura_id(Long id) {
        Pessoa achado = repository.findById(id);
        return PessoaResponse.valueOf(achado);
    }

  /*   @Override
    public PessoaResponse procura_nome(String nome) {
        Pessoa achado = repository.acharPorNome(nome);
        return PessoaResponse.valueOf(achado);
    } */

    @Override
    public List<Pessoa> procura_todos(Integer page, Integer pageSize) {
        PanacheQuery<Pessoa> query = null;
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

            private void validarDados(Pessoadto dto, Long id) {
        
    }
}
