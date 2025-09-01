package com.aura.risco_credito_api.infrastructure.repository;

import com.aura.risco_credito_api.core.domain.Cliente;
import com.aura.risco_credito_api.core.gateway.ClienteRepository;
import com.aura.risco_credito_api.infrastructure.mapper.ClienteEntityMapper;
import com.aura.risco_credito_api.infrastructure.mapper.ClienteMapper;
import com.aura.risco_credito_api.infrastructure.persistence.ClienteEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class UserRepositoryImpl implements ClienteRepository<Cliente, UUID> {
    private final SpringDataUserRepository repository;

    public UserRepositoryImpl(SpringDataUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Cliente> buscarPorId(UUID id) {
        Optional<ClienteEntity> clienteByIdOptional = repository.findById(id);
        if(clienteByIdOptional.isEmpty()) {
            return Optional.empty();
        }
        ClienteEntity clienteById = clienteByIdOptional.get();
        Cliente cliente = ClienteMapper.of(clienteById);
        return Optional.of(cliente);
    }

    @Override
    public Cliente salvar(Cliente cliente) {
        ClienteEntity clienteEntity = ClienteEntityMapper.of(cliente);
        ClienteEntity savedEntity = repository.save(clienteEntity);
        return ClienteMapper.of(savedEntity);
    }
}
