package com.rafaelcaxixi.spring_boot_cleanarch.domain.usuario;

import com.rafaelcaxixi.spring_boot_cleanarch.application.security.PasswordEncoderPort;

public class UsuarioDomain{
    private String login;
    private String senha;

    public UsuarioDomain(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public void encodePassword(PasswordEncoderPort passwordEncoder) {
        this.senha = passwordEncoder.encode(this.senha);
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
}
