package com.aura.risco_credito_api.core.gateway;

import com.aura.risco_credito_api.core.domain.Cliente;


import java.util.List;
import java.util.Optional;

public interface ClienteRepository<T, UUID> {
    // Imagine como se fossse um repository do spring
    // exemplos:
    Cliente salvar(Cliente cliente);
    Optional<Cliente> buscarPorId(UUID id);
    Optional<Cliente> buscarPorCpf(String cpf);
    List<Cliente> buscarTodos();
    Optional<Cliente> removerPorId(UUID id);
    Optional<Cliente> removerPorCpf(String cpf);
}
