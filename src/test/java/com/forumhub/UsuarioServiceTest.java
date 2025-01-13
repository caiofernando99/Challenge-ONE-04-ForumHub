package com.forumhub;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class UsuarioServiceTest {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    void deveCriptografarSenha() {
        String senhaOriginal = "123456";
        String senhaCriptografada = passwordEncoder.encode(senhaOriginal);
        Assertions.assertNotEquals(senhaOriginal, senhaCriptografada);
    }
}