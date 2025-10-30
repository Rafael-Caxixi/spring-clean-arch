package com.rafaelcaxixi.spring_boot_cleanarch.application.security;

public interface PasswordEncoderPort {
    String encode(String rawPassword);
    boolean matches(String rawPassword, String encodedPassword);
}
