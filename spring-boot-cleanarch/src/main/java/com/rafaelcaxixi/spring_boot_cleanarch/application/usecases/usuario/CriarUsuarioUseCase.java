package com.rafaelcaxixi.spring_boot_cleanarch.application.usecases.usuario;

import com.rafaelcaxixi.spring_boot_cleanarch.domain.usuario.UsuarioDomain;

public interface CriarUsuarioUseCase {

    UsuarioDomain execute(UsuarioDomain usuario);

}
