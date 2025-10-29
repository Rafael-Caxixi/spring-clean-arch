package com.rafaelcaxixi.spring_boot_cleanarch.application.gateway;

import com.rafaelcaxixi.spring_boot_cleanarch.domain.usuario.UsuarioDomain;

public interface UsuarioGateway {

    UsuarioDomain createUsuario(UsuarioDomain usuario);

}
