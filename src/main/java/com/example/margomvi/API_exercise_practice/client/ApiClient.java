package com.example.margomvi.API_exercise_practice.client;

import com.example.margomvi.API_exercise_practice.config.ApiConfig;
import com.example.margomvi.API_exercise_practice.model.ApiResponse;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Component
public class ApiClient {
    private final WebClient webClient;

    public ApiClient(WebClient.Builder builder, ApiConfig apiConfig) {
        this.webClient = builder.baseUrl(apiConfig.getBaseUrl()).build();  // Usa la URL del YAML
    }

    public String getFirstObjectName() {
        // Utilizamos bodyToMono para recibir un Mono con la lista completa
        Mono<List<ApiResponse>> responseMono = webClient.get()
                .uri("/objects")
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<ApiResponse>>() {});

        // Esperamos la respuesta de Mono y procesamos la lista
        List<ApiResponse> objects = responseMono.block();  // block() para obtener el valor sincronizado

        // Si la lista no es nula ni vacía, devolvemos el primer nombre; de lo contrario, mensaje por defecto
        return (objects != null && !objects.isEmpty()) ? objects.get(0).getName() : "No objects found";
    }

}
