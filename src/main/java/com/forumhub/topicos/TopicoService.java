package com.forumhub.topicos;

import com.forumhub.usuario.Usuario;
import com.forumhub.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class TopicoService {

    @Autowired
    private TopicosRepository topicosRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public void cadastrar(DadosCadastroTopico dados) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        Usuario usuario = usuarioRepository.findByNome(username)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        Topico topico = new Topico(dados);
        topico.setUsuario(usuario); // ASSOCIA O USUÁRIO AQUI!!!
        topicosRepository.save(topico);
    }
}