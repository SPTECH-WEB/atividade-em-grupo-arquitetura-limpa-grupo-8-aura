package com.aura.risco_credito_api.application.usecase;

import com.aura.risco_credito_api.core.gateway.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class ConsultarClienteUseCase {
    private final ClienteRepository clienteRepository;

    public ConsultarClienteUseCase(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
}
