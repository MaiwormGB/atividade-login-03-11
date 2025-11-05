package com.senai.atividade.aula.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.senai.atividade.aula.models.Usuario;
import com.senai.atividade.aula.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    
    @PostMapping("/salvar")
    public Usuario salvar(@RequestBody Usuario usuario, @RequestParam String confSenha) {
        return usuarioService.salvar(usuario, confSenha);
    }  

    // Classe interna para receber os dados de login
    public static class LoginRequest {
        public String email;
        public String senha;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest request) {
        boolean sucesso = usuarioService.verificarLogin(request.email, request.senha);

        if (sucesso) {
            return ResponseEntity.ok("Login realizado com sucesso!");
        } else {
            return ResponseEntity.status(401).body("Email ou senha incorretos!");
        }
    }
}