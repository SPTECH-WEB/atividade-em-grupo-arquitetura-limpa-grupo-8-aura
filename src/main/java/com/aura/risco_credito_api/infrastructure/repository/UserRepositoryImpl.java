package com.aura.risco_credito_api.infrastructure.repository;

import com.aura.risco_credito_api.core.domain.Cliente;
import com.aura.risco_credito_api.core.gateway.ClienteRepository;
import com.aura.risco_credito_api.infrastructure.mapper.ClienteEntityMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class UserRepositoryImpl implements ClienteRepository<Cliente, UUID> {
    private final SpringDataUserRepository repository;

    // Implementar os métodos da interface ClienteRepository aqui
    // Exemplo:
    // @Override
    // public Cliente salvar(Cliente cliente) {
    //     // Lógica para salvar o cliente usando Spring Data JPA
    // }

    //Deixei alguns métodos implementados aqui pra não subir com erro :)

    public UserRepositoryImpl(SpringDataUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Cliente> buscarTodos() {
        return List.of();
    }

    @Override
    public Optional<Cliente> buscarPorId(UUID id) {
        return Optional.empty();
    }

    @Override
    public Optional<Cliente> removerPorId(UUID id) {
        return Optional.empty();
    }

    @Override
    public Optional<Cliente> removerPorCpf(String cpf) {
        return Optional.empty();
    }

    @Override
    public Optional<Cliente> buscarPorCpf(String cpf) {
        return Optional.empty();
    }

    @Override
    public Cliente salvar(Cliente cliente) {
        return null;
    }



}
