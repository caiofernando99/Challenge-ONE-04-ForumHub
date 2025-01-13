package com.forumhub.topicos;
import com.forumhub.cursos.Curso;
import com.forumhub.cursos.CursoRepository;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TopicoService {

    @Autowired
    private TopicosRepository topicosRepository;

    @Autowired
    private CursoRepository cursoRepository;

    public Topico cadastrar(DadosCadastroTopico dados) {
        System.out.println("Dados recebidos: " + dados); // Imprima o objeto dados completo
        Curso curso = cursoRepository.findById(dados.cursoId())
                .orElseThrow(() -> new EntityNotFoundException("Curso não encontrado com o ID: " + dados.cursoId()));

        Topico topico = new Topico();
        topico.setTitulo(dados.titulo()); // Chamadas aos setters manuais
        topico.setMensagem(dados.mensagem());
        topico.setCurso(curso);        // Chamadas aos setters manuais
        topico.setNomeAutor(dados.nomeAutor());// Chamadas aos setters manuais
        return topicosRepository.save(topico);
    }

    public List<Topico> listar() {
        return topicosRepository.findAll();
    }
}