package org.acme.dto;

import org.acme.model.Endereco;

import jakarta.validation.constraints.NotNull;

public class Pessoadto {

    @NotNull(message = "O nome deve ser informado (back).")
    private String nome;

    @NotNull(message = "O nome deve ser informado (back).")
    private String sobrenome;

    @NotNull(message = "O nome deve ser informado (back).")
    private String cpf;

    @NotNull(message = "O nome deve ser informado (back).")
    private String telefone;

    @NotNull(message = "O nome deve ser informado (back).")
    private Endereco enderecoPessoa;

    @NotNull(message = "O nome deve ser informado (back).")
    private String username;

    @NotNull(message = "O nome deve ser informado (back).")
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEnderecoPessoa() {
        return enderecoPessoa;
    }

    public void setEnderecoPessoa(Endereco enderecoPessoa) {
        this.enderecoPessoa = enderecoPessoa;
    }

    public String getUsername() {
        return username;
    }

    public String getSenha() {
        return senha;
    }

 

}
