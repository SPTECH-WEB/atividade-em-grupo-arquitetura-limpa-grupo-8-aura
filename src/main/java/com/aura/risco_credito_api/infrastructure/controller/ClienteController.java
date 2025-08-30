package com.aura.risco_credito_api.infrastructure.controller;

import com.aura.risco_credito_api.application.usecase.ConsultarClienteUseCase;
import com.aura.risco_credito_api.application.usecase.CriarClienteUseCase;
import com.aura.risco_credito_api.infrastructure.mapper.ClienteEntityMapper;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    private final ConsultarClienteUseCase consultarClienteUseCase;
    private final CriarClienteUseCase criarClienteUseCase;

    public ClienteController(ConsultarClienteUseCase consultarClienteUseCase, CriarClienteUseCase criarClienteUseCase) {
        this.consultarClienteUseCase = consultarClienteUseCase;
        this.criarClienteUseCase = criarClienteUseCase;
    }
}
