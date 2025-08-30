package com.aura.risco_credito_api.core.domain.atributo;

import com.aura.risco_credito_api.core.domain.exception.ParametrosInvalidosException;

public class Cpf {

    private final String cpf;

    private Cpf(String cpf){
        this.cpf = cpf;
    }

    public static Cpf of(String cpf) {
        String regex = "^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$";
        if (! cpf.matches(regex)){
            throw new ParametrosInvalidosException("cpf invalido");
        }
        return new Cpf(cpf);
    }

    public String getCpf() {
        return cpf;
    }
}
