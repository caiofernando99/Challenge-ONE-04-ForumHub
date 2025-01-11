package com.forumhub.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("topicos")
public class usuarioController {
    @PostMapping
    public void cadastrar() {

        System.out.println("e ai?");
    }
}
