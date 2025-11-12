package com.senai.atividade.aula.services;

import java.util.Optional;

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
    public String login(String email, String senha){
      Usuario usuario = usuarioRepository.findByEmail(email);
      if(usuario != null && senha.equals(usuario.getSenha())){
        return "Login efetuado com sucesso";
      }
      return "Falha ao realizar o login";

    }

      public Usuario buscarUsuario(Integer id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        return usuario.orElse(null);
    }
 public Usuario atualizar(Usuario usuario, Integer id) {
        Usuario existente = buscarUsuario(id);

        if (existente != null) {
            usuario.setId(id);
            return usuarioRepository.save(usuario);
        } else {
            return null;
        }
    }

}