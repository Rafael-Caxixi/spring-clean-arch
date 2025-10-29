package com.rafaelcaxixi.spring_boot_cleanarch.infrastructure.data.repositories.impl;

import com.rafaelcaxixi.spring_boot_cleanarch.application.gateway.UsuarioGateway;
import com.rafaelcaxixi.spring_boot_cleanarch.domain.usuario.UsuarioDomain;
import com.rafaelcaxixi.spring_boot_cleanarch.infrastructure.data.datamappers.UsuarioMapper;
import com.rafaelcaxixi.spring_boot_cleanarch.infrastructure.data.repositories.UsuarioJpaRepository;
import com.rafaelcaxixi.spring_boot_cleanarch.infrastructure.entities.UsuarioEntity;

public class UsuarioRepositoryImpl implements UsuarioGateway {

    private final UsuarioJpaRepository usuarioJpaRepository;
    private final UsuarioMapper usuarioMapper;

    public  UsuarioRepositoryImpl(UsuarioJpaRepository usuarioJpaRepository, UsuarioMapper usuarioMapper) {
        this.usuarioJpaRepository = usuarioJpaRepository;
        this.usuarioMapper = usuarioMapper;
    }

    @Override
    public UsuarioDomain createUsuario(UsuarioDomain usuario) {
        UsuarioEntity usuarioEntity = usuarioMapper.toEntity(usuario);
        UsuarioEntity usuarioSalvo = usuarioJpaRepository.save(usuarioEntity);
        return usuarioMapper.toDomain(usuarioSalvo);
    }
}
