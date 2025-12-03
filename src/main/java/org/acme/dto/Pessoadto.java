package org.acme.dto;

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
    private Long enderecoPessoa;

    @NotNull(message = "O nome deve ser informado (back).")
    private String username;

    @NotNull(message = "O nome deve ser informado (back).")
    private String senha;

    private int perfil;

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


    public String getUsername() {
        return username;
    }

    public String getSenha() {
        return senha;
    }

    public Long getEnderecoPessoa() {
        return enderecoPessoa;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

 

}
