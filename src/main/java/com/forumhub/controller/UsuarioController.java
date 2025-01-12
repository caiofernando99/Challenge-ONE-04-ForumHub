package com.forumhub.controller;
import com.forumhub.usuario.DadosCadastroUsuario;
import com.forumhub.usuario.Usuario;
import com.forumhub.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuario")
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroUsuario dados) {
        repository.save(new Usuario(dados));

    }
}
