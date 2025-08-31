package com.aura.risco_credito_api.infrastructure.dto;

import java.util.UUID;

public record GenericoClienteResponse(
        UUID id,
        String nome,
        String email,
        String telefone,
        String cpf,
        Float rendaMensal,
        Integer idade,
        String profissao
) { }
