package com.senai.atividade.aula.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Atividade-03/11 - Site empresarial",
        version = "1.0",
        description = "Grupo - Gabriel Maiworm | Rebeca Coelho | Arthur Correia | Gabriel Teodoro | Arthur Mayworm | Ana Clara Saldanha"
    )
)

public class Swagger {

}
