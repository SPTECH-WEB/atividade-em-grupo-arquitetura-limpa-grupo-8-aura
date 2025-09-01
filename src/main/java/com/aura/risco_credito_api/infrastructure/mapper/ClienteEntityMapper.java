package com.aura.risco_credito_api.infrastructure.mapper;

import com.aura.risco_credito_api.core.domain.Cliente;
import com.aura.risco_credito_api.infrastructure.dto.GenericoClienteResponse;
import com.aura.risco_credito_api.infrastructure.dto.PostClienteRequestDto;
import com.aura.risco_credito_api.infrastructure.persistence.ClienteEntity;

import java.util.UUID;

public class ClienteEntityMapper {

    public static ClienteEntity of(Cliente cliente) {
        if(cliente == null) {
            return null;
        }

        ClienteEntity clienteEntity = new ClienteEntity(
                cliente.getId(),
                cliente.getNome(),
                cliente.getEmail().getEmail(),
                cliente.getTelefone().getTelefone(),
                cliente.getCpf().getCpf(),
                cliente.getRendaMensal(),
                cliente.getIdade(),
                cliente.getProfissao()
        );
        return clienteEntity;
    }

    public static ClienteEntity of(PostClienteRequestDto dto) {
        if(dto == null) {
            return null;
        }

        ClienteEntity cliente = new ClienteEntity(
                UUID.randomUUID(),
                dto.nome(),
                dto.email(),
                dto.telefone(),
                dto.cpf(),
                dto.rendaMensal(),
                dto.idade(),
                dto.profissao()
        );

        return cliente;
    }
}
