package com.senai.atividade.aula.models;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuário")
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    @Column (name = "id")
    private Integer id;
    
    @Column (name = "nome")
    private String nome;

    @Column (name = "email")
    private String email;

    @Column (name = "data_nascimento")
    private LocalDate dataNascimento;

    @Column (name = "senha")
    private String senha;

    @Column (name = "CPF")
    private String CPF;

    public Usuario(Integer id, String nome, String email, LocalDate dataNascimento, String senha, String cPF) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
        CPF = cPF;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    
    
}
