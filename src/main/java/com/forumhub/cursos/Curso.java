package com.forumhub.cursos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cursos")
@Getter @Setter
@AllArgsConstructor
public class Curso {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String categoria;

    public Curso() {}

    public Curso(DadosCadastroCurso dados) {
        this.nome = dados.nome();
        this.categoria = dados.categoria();
    }
}