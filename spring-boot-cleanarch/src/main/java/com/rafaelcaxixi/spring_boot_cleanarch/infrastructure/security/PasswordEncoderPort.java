package com.rafaelcaxixi.spring_boot_cleanarch.infrastructure.security;

public interface PasswordEncoderPort {
    String encode(String rawPassword);
    boolean matches(String rawPassword, String encodedPassword);
}
