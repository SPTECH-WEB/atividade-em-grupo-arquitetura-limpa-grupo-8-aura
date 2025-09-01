package com.aura.risco_credito_api.application.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ElementoNaoEncontradoException extends RuntimeException {
    public ElementoNaoEncontradoException(String message) {
        super(message);
    }
}
