package com.rafaelcaxixi.spring_boot_cleanarch.infrastructure.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;

@Table(name = "usuarios")
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String senha;

    public UsuarioEntity(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

}
