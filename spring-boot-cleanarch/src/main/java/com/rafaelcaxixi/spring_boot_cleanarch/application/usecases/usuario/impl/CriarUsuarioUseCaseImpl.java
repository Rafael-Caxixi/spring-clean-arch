package com.rafaelcaxixi.spring_boot_cleanarch.application.usecases.usuario.impl;

import com.rafaelcaxixi.spring_boot_cleanarch.application.gateway.UsuarioGateway;
import com.rafaelcaxixi.spring_boot_cleanarch.application.usecases.usuario.CriarUsuarioUseCase;
import com.rafaelcaxixi.spring_boot_cleanarch.domain.usuario.UsuarioDomain;
import com.rafaelcaxixi.spring_boot_cleanarch.infrastructure.security.PasswordEncoderPort;

public class CriarUsuarioUseCaseImpl implements CriarUsuarioUseCase {

    private final UsuarioGateway usuarioGateway;
    private final PasswordEncoderPort passwordEncoder;

    public CriarUsuarioUseCaseImpl(UsuarioGateway usuarioGateway, PasswordEncoderPort passwordEncoder) {
        this.usuarioGateway = usuarioGateway;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UsuarioDomain execute(UsuarioDomain usuario) {
        usuario.encodePassword(passwordEncoder);
        return usuarioGateway.createUsuario(usuario);
    }
}
