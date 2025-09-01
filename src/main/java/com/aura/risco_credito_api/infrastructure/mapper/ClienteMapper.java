package com.aura.risco_credito_api.infrastructure.mapper;

import com.aura.risco_credito_api.application.exception.ParametrosInvalidosHttpException;
import com.aura.risco_credito_api.core.domain.Cliente;
import com.aura.risco_credito_api.core.exception.ParametrosInvalidosException;
import com.aura.risco_credito_api.infrastructure.persistence.ClienteEntity;

public class ClienteMapper {
    public static Cliente of(ClienteEntity clienteEntity) {
        if(clienteEntity == null) {
            return null;
        }

        try {
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
            return cliente;
        }
        catch (ParametrosInvalidosException e) {
            throw new ParametrosInvalidosHttpException("Parâmetros inválidos ao mapear ClienteEntity para Cliente: " + e.getMessage());
        }
        catch (Exception e) {
            throw new RuntimeException("Erro ao mapear ClienteEntity para Cliente: " + e.getMessage(), e);
        }
    }
}
