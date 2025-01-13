package com.forumhub.topicos;
import com.forumhub.cursos.Curso;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "topicos")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensagem;
    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;
    private LocalDateTime dataCriacao = LocalDateTime.now();
    private String nomeAutor;


    public Topico() {
        // Construtor sem argumentos (obrigatório para JPA)
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    //Getters manuais (precisa adicionar tambem)
    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public Curso getCurso() {
        return curso;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }


}