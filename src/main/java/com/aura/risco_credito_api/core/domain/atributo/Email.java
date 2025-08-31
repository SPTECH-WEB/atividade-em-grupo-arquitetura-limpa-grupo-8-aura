package com.aura.risco_credito_api.core.domain.atributo;

import com.aura.risco_credito_api.core.exception.ParametrosInvalidosException;

public class Email {

    private final String email;

    private Email(String email){
        this.email = email;
    }

    public static Email of(String email) {
        String regex = "^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$";
        if (! email.matches(regex)){
            throw new ParametrosInvalidosException("email invalido");
        }
        return new Email(email);
    }

    public String getEmail() {
        return email;
    }


}
