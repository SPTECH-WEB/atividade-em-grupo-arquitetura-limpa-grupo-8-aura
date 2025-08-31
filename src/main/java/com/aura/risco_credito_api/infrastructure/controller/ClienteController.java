package com.aura.risco_credito_api.infrastructure.controller;

import com.aura.risco_credito_api.application.usecase.ConsultarClienteUseCase;
import com.aura.risco_credito_api.application.usecase.CriarClienteUseCase;
import com.aura.risco_credito_api.core.domain.Cliente;
import com.aura.risco_credito_api.core.domain.atributo.Cpf;
import com.aura.risco_credito_api.core.domain.atributo.Email;
import com.aura.risco_credito_api.core.domain.atributo.Telefone;
import com.aura.risco_credito_api.infrastructure.dto.PostClienteRequestDto;
import com.aura.risco_credito_api.infrastructure.persistence.ClienteEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class ClienteController {

    private final ConsultarClienteUseCase consultarClienteUseCase;
    private final CriarClienteUseCase criarClienteUseCase;

    public ClienteController(ConsultarClienteUseCase consultarClienteUseCase, CriarClienteUseCase criarClienteUseCase) {
        this.consultarClienteUseCase = consultarClienteUseCase;
        this.criarClienteUseCase = criarClienteUseCase;
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<PostClienteRequestDto> cadastrarCliente(@RequestBody PostClienteRequestDto dto){

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

        ClienteEntity clienteCriado = criarClienteUseCase.criarCliente(cliente);

        PostClienteRequestDto clienteDto = new PostClienteRequestDto(
                clienteCriado.getId(),
                clienteCriado.getNome(),
                clienteCriado.getEmail(),
                clienteCriado.getTelefone(),
                clienteCriado.getCpf(),
                clienteCriado.getRendaMensal(),
                clienteCriado.getIdade(),
                clienteCriado.getProfissao()
        );

        return ResponseEntity.ok(clienteDto);
    }
}
