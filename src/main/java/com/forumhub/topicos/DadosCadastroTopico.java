package com.forumhub.topicos;
import com.forumhub.cursos.Curso;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroTopico(
        @NotBlank String titulo,
        @NotBlank String mensagem,
        @NotNull Long cursoId, // Agora passa apenas o ID
        @NotBlank String nomeAutor
) {
}