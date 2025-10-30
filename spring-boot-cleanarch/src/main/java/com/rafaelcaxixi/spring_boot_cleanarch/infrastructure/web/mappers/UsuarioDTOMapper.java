package com.rafaelcaxixi.spring_boot_cleanarch.infrastructure.web.mappers;

import com.rafaelcaxixi.spring_boot_cleanarch.domain.usuario.UsuarioDomain;
import com.rafaelcaxixi.spring_boot_cleanarch.infrastructure.web.dto.response.UsuarioCreateResponseDTO;

public class UsuarioDTOMapper {

    public UsuarioDomain toDomain(String login, String senha) {
        return new UsuarioDomain(login, senha);
    }

    public UsuarioCreateResponseDTO toResponseDTO(UsuarioDomain domain) {
        return new UsuarioCreateResponseDTO(domain.getLogin());
    }
}
