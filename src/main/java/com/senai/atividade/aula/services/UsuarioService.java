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

    // Método para verificar login
    public boolean verificarLogin(String email, String senha) {
        Usuario usuario = usuarioRepository.findByEmailAndSenha(email, senha);
        return usuario != null; // Retorna true se encontrou um usuário com as credenciais
    }

    // (Opcional) Retorna o próprio usuário, caso queira usar as informações após login
    public Usuario buscarUsuarioPorEmail(String email) {
        return usuarioRepository.findAll()
                .stream()
                .filter(u -> u.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }
}