package com.senai.atividade.aula.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Atividade-03/11",
        version = "1.0",
        description = ""
    )
)

public class Swagger {

}
