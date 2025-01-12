package com.forumhub.controller;
import com.forumhub.topicos.DadosCadastroTopico;
import com.forumhub.topicos.Topico;
import com.forumhub.topicos.TopicosRepository;
import com.forumhub.usuario.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("topicos")
public class topicosController {
    @Autowired
    private TopicosRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroTopico dados) {
        repository.save(new Topico(dados));

    }
}
