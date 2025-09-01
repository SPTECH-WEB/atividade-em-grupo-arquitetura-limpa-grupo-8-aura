package com.aura.risco_credito_api.application.usecase;

import com.aura.risco_credito_api.core.domain.Cliente;
import com.aura.risco_credito_api.core.gateway.ClienteRepository;
import com.aura.risco_credito_api.infrastructure.mapper.ClienteMapper;
import com.aura.risco_credito_api.infrastructure.persistence.ClienteEntity;
import org.springframework.stereotype.Service;

@Service
public class CriarClienteUseCase {
    private final ClienteRepository clienteRepository;

    public CriarClienteUseCase(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente criarCliente(ClienteEntity clienteEntity) {

        Cliente cliente = ClienteMapper.of(clienteEntity);

       Cliente clienteSalvo = clienteRepository.salvar(cliente);


        return clienteSalvo;
    }
}
