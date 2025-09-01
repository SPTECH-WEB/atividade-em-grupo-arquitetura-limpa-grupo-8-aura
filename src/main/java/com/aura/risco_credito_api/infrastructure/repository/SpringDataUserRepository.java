package com.aura.risco_credito_api.infrastructure.repository;

import com.aura.risco_credito_api.infrastructure.persistence.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface SpringDataUserRepository extends JpaRepository<ClienteEntity, UUID> {
}
