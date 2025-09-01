package com.aura.risco_credito_api.infrastructure.mapper;

import com.aura.risco_credito_api.application.exception.ParametrosInvalidosHttpException;
import com.aura.risco_credito_api.core.domain.Cliente;
import com.aura.risco_credito_api.core.exception.ParametrosInvalidosException;
import com.aura.risco_credito_api.infrastructure.dto.GenericoClienteResponse;
import com.aura.risco_credito_api.infrastructure.dto.PostClienteRequestDto;
import com.aura.risco_credito_api.infrastructure.persistence.ClienteEntity;

public class ClienteDtoMapper {
    public static GenericoClienteResponse toResponse(Cliente cliente) {
        if (cliente == null) {
            return null;
        }
        GenericoClienteResponse responseCliente = new GenericoClienteResponse(
                cliente.getId(),
                cliente.getNome(),
                cliente.getEmail().getEmail(),
                cliente.getTelefone().getTelefone(),
                cliente.getCpf().getCpf(),
                cliente.getRendaMensal(),
                cliente.getIdade(),
                cliente.getProfissao(),
                cliente.getClassificacaoRisco().getDescricao(),
                cliente.getClassificacaoRisco().getEstrategiaContato()
        );

        return responseCliente;
    }
}
