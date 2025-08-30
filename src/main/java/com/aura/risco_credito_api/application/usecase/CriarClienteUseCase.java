package com.aura.risco_credito_api.application.usecase;

import com.aura.risco_credito_api.core.gateway.ClienteRepository;
import com.aura.risco_credito_api.infrastructure.persistence.ClienteEntity;
import org.springframework.stereotype.Service;

@Service
public class CriarClienteUseCase {
    private final ClienteRepository clienteRepository;

    public CriarClienteUseCase(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public void criarCliente(ClienteEntity clienteEntity) {
        // Lógica para criar um cliente
        // Exemplo:
        // Telefone telefone = new Telefone();
        // Email email = new Email();
        // Cpf cpf = new Cpf();
        // Cliente cliente = new Cliente(...);
        // clienteRepository.salvar(cliente);
    }
}
