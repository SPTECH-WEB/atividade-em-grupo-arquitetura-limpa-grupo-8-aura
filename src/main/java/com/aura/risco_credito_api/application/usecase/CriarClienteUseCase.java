package com.aura.risco_credito_api.application.usecase;

import com.aura.risco_credito_api.core.domain.Cliente;
import com.aura.risco_credito_api.core.gateway.ClienteRepository;
import com.aura.risco_credito_api.infrastructure.persistence.ClienteEntity;
import org.springframework.stereotype.Service;

@Service
public class CriarClienteUseCase {
    private final ClienteRepository clienteRepository;

    public CriarClienteUseCase(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public ClienteEntity criarCliente(ClienteEntity clienteEntity) {

        Cliente cliente = new Cliente(
                clienteEntity.getId(),
                clienteEntity.getNome(),
                clienteEntity.getEmail(),
                clienteEntity.getTelefone(),
                clienteEntity.getCpf(),
                clienteEntity.getRendaMensal(),
                clienteEntity.getIdade(),
                clienteEntity.getProfissao()
        );

       Cliente clienteSalvo = clienteRepository.salvar(cliente);

        ClienteEntity clienteEntitySalvo = new ClienteEntity(
                clienteSalvo.getId(),
                clienteSalvo.getNome(),
                clienteSalvo.getEmail().getEmail(),
                clienteSalvo.getTelefone().getTelefone(),
                clienteSalvo.getCpf().getCpf(),
                clienteSalvo.getRendaMensal(),
                clienteSalvo.getIdade(),
                clienteSalvo.getProfissao()
        );

        return clienteEntitySalvo;
    }
}
