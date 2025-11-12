package com.senai.atividade.aula.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.senai.atividade.aula.models.Endereco;
import com.senai.atividade.aula.services.EnderecoService;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

      @Autowired
    private EnderecoService enderecoService;

    
        @PostMapping("/salvar")
    public Endereco salvar(@RequestParam String cep, @RequestParam(required=false) String numero, @RequestParam(required=false) String referencia) {
        return enderecoService.salvar(cep, numero, referencia);
    }
    
      @GetMapping("/buscarEndereco/{id}")
    public Endereco buscarEndereco(@PathVariable Integer id) {
        return enderecoService.buscarEndereco(id);
    }
}


