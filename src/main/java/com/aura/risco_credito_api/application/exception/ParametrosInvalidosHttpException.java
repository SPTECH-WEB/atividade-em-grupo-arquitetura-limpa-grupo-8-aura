package com.aura.risco_credito_api.application.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ParametrosInvalidosHttpException extends RuntimeException {
    public ParametrosInvalidosHttpException(String message) {
        super(message);
    }
}
