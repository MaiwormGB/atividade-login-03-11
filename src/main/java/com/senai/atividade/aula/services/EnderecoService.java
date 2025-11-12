package com.senai.atividade.aula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.senai.atividade.aula.models.Endereco;
import com.senai.atividade.aula.repositories.EnderecoRepository;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;
    
           public Endereco salvar(String cep, String numero, String referencia) {
        Endereco endereco = buscarViaCep(cep);
        endereco.setNumero(numero);
        endereco.setReferencia(referencia);
        return enderecoRepository.save(endereco);
    }

    public Endereco buscarViaCep(String cep) {
        RestTemplate template = new RestTemplate();
        Endereco endereco = template.getForObject("https://viacep.com.br/ws/{cep}/json", Endereco.class, cep);
        return endereco;
    }

    public Endereco buscarEndereco(Integer id) {
        return enderecoRepository.findById(id).get();
    }
    }



