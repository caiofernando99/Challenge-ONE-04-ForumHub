package com.forumhub.controller;
import com.forumhub.topicos.DadosCadastroTopico;
import com.forumhub.topicos.Topico;
import com.forumhub.topicos.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicosController {

    @Autowired
    private TopicoService topicoService;

    @PostMapping
    public ResponseEntity<Void> cadastrar(@RequestBody @Valid DadosCadastroTopico dados) {
        System.out.println("Dados recebidos no Controller: " + dados); // Imprima o objeto dados completo
        System.out.println("Título recebido no Controller: " + dados.titulo());
        topicoService.cadastrar(dados);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Topico>> listar() {
        List<Topico> topicos = topicoService.listar();
        return ResponseEntity.ok(topicos);
    }

}