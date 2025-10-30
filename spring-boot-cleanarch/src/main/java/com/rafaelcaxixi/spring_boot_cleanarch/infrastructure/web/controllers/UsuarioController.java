package com.rafaelcaxixi.spring_boot_cleanarch.infrastructure.web.controllers;

import com.rafaelcaxixi.spring_boot_cleanarch.application.usecases.usuario.CriarUsuarioUseCase;
import com.rafaelcaxixi.spring_boot_cleanarch.domain.usuario.UsuarioDomain;
import com.rafaelcaxixi.spring_boot_cleanarch.infrastructure.web.dto.request.UsuarioCreateRequestDTO;
import com.rafaelcaxixi.spring_boot_cleanarch.infrastructure.web.dto.response.UsuarioCreateResponseDTO;
import com.rafaelcaxixi.spring_boot_cleanarch.infrastructure.web.mappers.UsuarioDTOMapper;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final CriarUsuarioUseCase criarUsuarioUseCase;
    private final UsuarioDTOMapper usuarioDTOMapper;

    public UsuarioController(CriarUsuarioUseCase criarUsuarioUseCase, UsuarioDTOMapper usuarioDTOMapper) {
        this.criarUsuarioUseCase = criarUsuarioUseCase;
        this.usuarioDTOMapper = usuarioDTOMapper;
    }

    @PostMapping
    public ResponseEntity<UsuarioCreateResponseDTO> criarUsuario(@RequestBody @Valid UsuarioCreateRequestDTO usuarioDto) {
        UsuarioDomain usuarioDomain = usuarioDTOMapper.toDomain(usuarioDto.login(), usuarioDto.senha());
        UsuarioDomain usuarioDomainCriado = criarUsuarioUseCase.execute(usuarioDomain);
        return ResponseEntity.ok(usuarioDTOMapper.toResponseDTO(usuarioDomainCriado));
    }

}
