package com.aura.risco_credito_api.infrastructure.repository;

import com.aura.risco_credito_api.core.domain.Cliente;
import com.aura.risco_credito_api.core.gateway.ClienteRepository;
import com.aura.risco_credito_api.infrastructure.mapper.ClienteEntityMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements ClienteRepository {
    private final SpringDataUserRepository repository;

    public UserRepositoryImpl(SpringDataUserRepository repository) {
        this.repository = repository;
    }

    // Implementar os métodos da interface ClienteRepository aqui
    // Exemplo:
    // @Override
    // public Cliente salvar(Cliente cliente) {
    //     // Lógica para salvar o cliente usando Spring Data JPA
    // }
}
