package com.aura.risco_credito_api.application.usecase;

import com.aura.risco_credito_api.application.exception.ElementoNaoEncontradoException;
import com.aura.risco_credito_api.core.domain.Cliente;
import com.aura.risco_credito_api.core.gateway.ClienteRepository;
import com.aura.risco_credito_api.infrastructure.persistence.ClienteEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class ConsultarClienteUseCase {
    private final ClienteRepository clienteRepository;

    public ConsultarClienteUseCase(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente ConsultarClienteUseCase(UUID id){
        Optional<Cliente> clienteEntityOptional = clienteRepository.buscarPorId(id);
        if (clienteEntityOptional.isEmpty()){
            throw new ElementoNaoEncontradoException("Cliente não encontrado");
        }
        Cliente clienteEntity = clienteEntityOptional.get();
//        Cliente cliente = new Cliente(
//                clienteEntity.getId(),
//                clienteEntity.getNome(),
//                clienteEntity.getEmail(),
//                clienteEntity.getTelefone(),
//                clienteEntity.getCpf(),
//                clienteEntity.getRendaMensal(),
//                clienteEntity.getIdade(),
//                clienteEntity.getProfissao()
//        );
        return clienteEntity;
    }
}
