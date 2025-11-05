package com.senai.atividade.aula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.atividade.aula.models.Usuario;
import com.senai.atividade.aula.repositories.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario salvar(Usuario usuario, String confSenha){
        if (usuario.getSenha().equals(confSenha)) {
          return usuarioRepository.save(usuario);  
        }
        return null;
    }

}