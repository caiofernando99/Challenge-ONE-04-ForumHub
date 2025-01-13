package com.forumhub.topicos;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TopicosRepository extends JpaRepository<Topico, Long> {
    Optional<Topico> findByTituloAndMensagem(String titulo, String mensagem);
}
