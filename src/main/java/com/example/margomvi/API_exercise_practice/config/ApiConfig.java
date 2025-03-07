package com.example.margomvi.API_exercise_practice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration  // Indica que esta es una clase de configuración
@ConfigurationProperties(prefix = "api")  // Busca los valores que empiecen con "api" en application.yaml
public class ApiConfig {
    private String baseUrl;

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }
}
