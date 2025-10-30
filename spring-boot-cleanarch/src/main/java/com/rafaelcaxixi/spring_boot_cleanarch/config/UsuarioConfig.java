package com.rafaelcaxixi.spring_boot_cleanarch.config;

import com.rafaelcaxixi.spring_boot_cleanarch.application.gateway.UsuarioGateway;
import com.rafaelcaxixi.spring_boot_cleanarch.application.usecases.usuario.impl.CriarUsuarioUseCaseImpl;
import com.rafaelcaxixi.spring_boot_cleanarch.infrastructure.data.datamappers.UsuarioMapper;
import com.rafaelcaxixi.spring_boot_cleanarch.infrastructure.data.repositories.UsuarioJpaRepository;
import com.rafaelcaxixi.spring_boot_cleanarch.infrastructure.data.repositories.impl.UsuarioRepositoryImpl;
import com.rafaelcaxixi.spring_boot_cleanarch.infrastructure.security.BCryptPasswordEncoderAdapter;
import com.rafaelcaxixi.spring_boot_cleanarch.application.security.PasswordEncoderPort;
import com.rafaelcaxixi.spring_boot_cleanarch.infrastructure.web.mappers.UsuarioDTOMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsuarioConfig {

    // Configurações relacionadas ao usuário e suas dependências podem ser adicionadas aqui

    @Bean
    CriarUsuarioUseCaseImpl criarUsuarioUseCase(UsuarioGateway usuarioGateway, PasswordEncoderPort passwordEncoder) {
        return new CriarUsuarioUseCaseImpl(usuarioGateway, passwordEncoder);
    }

    @Bean
    UsuarioGateway usuarioGateway(UsuarioJpaRepository usuarioJpaRepository, UsuarioMapper usuarioMapper) {
        return new UsuarioRepositoryImpl(usuarioJpaRepository, usuarioMapper);
    }

    @Bean
    UsuarioMapper usuarioMapper() {
        return new UsuarioMapper();
    }

    @Bean
    UsuarioDTOMapper usuarioDTOMapper() {
        return new UsuarioDTOMapper();
    }

    @Bean
    PasswordEncoderPort passwordEncoder() {
        return new BCryptPasswordEncoderAdapter();
    }
}
