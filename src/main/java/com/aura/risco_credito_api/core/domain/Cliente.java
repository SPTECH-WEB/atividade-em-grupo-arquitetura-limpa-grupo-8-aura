package com.aura.risco_credito_api.core.domain;

import com.aura.risco_credito_api.core.domain.atributo.Cpf;
import com.aura.risco_credito_api.core.domain.atributo.Email;
import com.aura.risco_credito_api.core.domain.atributo.Telefone;
import com.aura.risco_credito_api.core.domain.exception.ParametrosInvalidosException;

import java.util.UUID;

public class Cliente {

    private final UUID id;
    private final String nome;
    private final Email email;
    private final Telefone telefone;
    private final Cpf cpf;
    private final Float rendaMensal;
    private final Integer idade;
    private final String profissao;


    public Cliente(String nome, String email, String telefone, String cpf, Float rendaMensal, Integer idade, String profissao) {

        if (nome == null || nome.isEmpty()) throw new ParametrosInvalidosException("nome invalido");

        if (idade == null || idade <= 0) throw new ParametrosInvalidosException("idade invalida");

        if (rendaMensal == null || rendaMensal.isNaN()) throw new ParametrosInvalidosException("renda invalida");

        if (profissao.trim().isEmpty()) profissao = null;

        this.id = UUID.randomUUID();
        this.nome = nome;
        this.email = Email.of(email);
        this.telefone = Telefone.of(telefone);
        this.cpf = Cpf.of(cpf);
        this.rendaMensal = rendaMensal;
        this.idade = idade;
        this.profissao = profissao;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Email getEmail() {
        return email;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public Cpf getCpf() {
        return cpf;
    }

    public Float getRendaMensal() {
        return rendaMensal;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getProfissao() {
        return profissao;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email=" + email.getEmail() +
                ", telefone=" + telefone.getTelefone() +
                ", cpf=" + cpf.getCpf() +
                ", rendaMensal=" + rendaMensal +
                ", idade=" + idade +
                ", profissao='" + profissao + '\'' +
                '}';
    }
}
