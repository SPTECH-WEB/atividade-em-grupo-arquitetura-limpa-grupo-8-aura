package com.aura.risco_credito_api.infrastructure.controller;

import com.aura.risco_credito_api.application.usecase.ConsultarClienteUseCase;
import com.aura.risco_credito_api.application.usecase.CriarClienteUseCase;
import com.aura.risco_credito_api.core.domain.Cliente;
import com.aura.risco_credito_api.core.domain.atributo.Cpf;
import com.aura.risco_credito_api.core.domain.atributo.Email;
import com.aura.risco_credito_api.core.domain.atributo.Telefone;
import com.aura.risco_credito_api.infrastructure.dto.GenericoClienteResponse;
import com.aura.risco_credito_api.infrastructure.dto.PostClienteRequestDto;
import com.aura.risco_credito_api.infrastructure.mapper.ClienteDtoMapper;
import com.aura.risco_credito_api.infrastructure.mapper.ClienteEntityMapper;
import com.aura.risco_credito_api.infrastructure.mapper.ClienteMapper;
import com.aura.risco_credito_api.infrastructure.persistence.ClienteEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ConsultarClienteUseCase consultarClienteUseCase;
    private final CriarClienteUseCase criarClienteUseCase;

    public ClienteController(ConsultarClienteUseCase consultarClienteUseCase, CriarClienteUseCase criarClienteUseCase) {
        this.consultarClienteUseCase = consultarClienteUseCase;
        this.criarClienteUseCase = criarClienteUseCase;
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<GenericoClienteResponse> cadastrarCliente(@RequestBody PostClienteRequestDto dto){

        ClienteEntity cliente = ClienteEntityMapper.of(dto);
        Cliente clienteCriado = criarClienteUseCase.criarCliente(cliente);

        GenericoClienteResponse clienteDto = ClienteDtoMapper.toResponse(clienteCriado);
        return ResponseEntity.ok(clienteDto);
    }

    @GetMapping("{id}")
    public ResponseEntity<GenericoClienteResponse> ConsultarClienteUseCase(@PathVariable UUID id){

        Cliente cliente = consultarClienteUseCase.ConsultarClienteUseCase(id);

        GenericoClienteResponse clienteDto = ClienteDtoMapper.toResponse(cliente);
        return ResponseEntity.ok(clienteDto);
    }
}
