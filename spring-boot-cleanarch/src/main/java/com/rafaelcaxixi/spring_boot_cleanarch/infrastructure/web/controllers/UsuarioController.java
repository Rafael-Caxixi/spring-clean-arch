package com.rafaelcaxixi.spring_boot_cleanarch.infrastructure.web.controllers;

import com.rafaelcaxixi.spring_boot_cleanarch.application.usecases.usuario.CriarUsuarioUseCase;
import com.rafaelcaxixi.spring_boot_cleanarch.domain.usuario.UsuarioDomain;
import com.rafaelcaxixi.spring_boot_cleanarch.infrastructure.web.dto.request.UsuarioCreateRequestDTO;
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

    public UsuarioController(CriarUsuarioUseCase criarUsuarioUseCase) {
        this.criarUsuarioUseCase = criarUsuarioUseCase;
    }

//    @PostMapping
//    public ResponseEntity<UsuarioDomain> criarUsuario(@RequestBody @Valid UsuarioCreateRequestDTO usuario) {
//        UsuarioDomain usuarioDomain;
//    }

}
