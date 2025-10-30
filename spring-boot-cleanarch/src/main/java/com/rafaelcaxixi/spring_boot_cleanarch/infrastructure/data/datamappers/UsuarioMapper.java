package com.rafaelcaxixi.spring_boot_cleanarch.infrastructure.data.datamappers;

import com.rafaelcaxixi.spring_boot_cleanarch.domain.usuario.UsuarioDomain;
import com.rafaelcaxixi.spring_boot_cleanarch.infrastructure.entities.UsuarioEntity;

public class UsuarioMapper {

    public UsuarioEntity toEntity(UsuarioDomain domain) {
        return new UsuarioEntity(domain.getLogin(), domain.getSenha());
    }

    public UsuarioDomain toDomain(UsuarioEntity entity) {
        return new UsuarioDomain(entity.getLogin(), entity.getSenha());
    }
}
