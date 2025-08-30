package com.aura.risco_credito_api.core.domain.atributo;

import com.aura.risco_credito_api.core.domain.exception.ParametrosInvalidosException;

public class Telefone {

    private final String telefone;

    private Telefone(String telefone){
        this.telefone = telefone;
    }

    public static Telefone of(String telefone) {
        String regex = "^\\d{10,11}$";
        if (! telefone.matches(regex)){
            throw new ParametrosInvalidosException("Telefone invalido");
        }
        return new Telefone(telefone);
    }

    public String getTelefone() {
        return telefone;
    }


}
