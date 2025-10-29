package com.rafaelcaxixi.spring_boot_cleanarch.application.usecases.usuario.impl;

import com.rafaelcaxixi.spring_boot_cleanarch.application.gateway.UsuarioGateway;
import com.rafaelcaxixi.spring_boot_cleanarch.application.usecases.usuario.CriarUsuarioUseCase;
import com.rafaelcaxixi.spring_boot_cleanarch.domain.usuario.UsuarioDomain;

public class CriarUsuarioUseCaseImpl implements CriarUsuarioUseCase {

    private final UsuarioGateway usuarioGateway;

    @Override
    public void execute(UsuarioDomain usuario) {

    }
}
