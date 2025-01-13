package com.forumhub.controller;

import com.forumhub.cursos.Curso;
import com.forumhub.cursos.CursoRepository;
import com.forumhub.cursos.DadosCadastroCurso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;

    @PostMapping
    public ResponseEntity<Curso> cadastrar(@RequestBody @Valid DadosCadastroCurso dados) {
        Curso curso = new Curso(dados);
        Curso cursoSalvo = cursoRepository.save(curso);
        return new ResponseEntity<>(cursoSalvo, HttpStatus.CREATED);
    }

}