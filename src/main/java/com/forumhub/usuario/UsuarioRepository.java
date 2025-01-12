package com.forumhub.usuario;

import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.ScopedValue;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
    <T> ScopedValue<T> findByNome(String username);
}
