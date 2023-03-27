package com.springboot.address_Book_Backend.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//http://localhost:8080/swagger-ui.html

@OpenAPIDefinition
@Configuration
public class SwaggerConfiguration {
    @Bean
    public OpenAPI baseOpenAPI() {
        return new OpenAPI().info(new Info().title("Address Book Doc").version("1.0.0").description("Api's of AddressBook"));
    }
}
