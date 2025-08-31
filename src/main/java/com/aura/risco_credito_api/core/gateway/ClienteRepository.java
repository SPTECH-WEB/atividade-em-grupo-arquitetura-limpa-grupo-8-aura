package com.aura.risco_credito_api.core.gateway;

import com.aura.risco_credito_api.core.domain.Cliente;


import java.util.List;
import java.util.Optional;

public interface ClienteRepository<T, UUID> {
    Cliente salvar(Cliente cliente);
    Optional<Cliente> buscarPorId(UUID id);
}
