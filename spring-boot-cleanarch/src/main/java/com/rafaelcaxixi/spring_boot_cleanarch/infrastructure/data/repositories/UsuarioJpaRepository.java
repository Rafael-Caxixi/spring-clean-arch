package com.rafaelcaxixi.spring_boot_cleanarch.infrastructure.data.repositories;

import com.rafaelcaxixi.spring_boot_cleanarch.infrastructure.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioJpaRepository extends JpaRepository<UsuarioEntity, Long> {
}
