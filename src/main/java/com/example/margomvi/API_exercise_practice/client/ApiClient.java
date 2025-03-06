package com.example.margomvi.API_exercise_practice.client;

import com.example.margomvi.API_exercise_practice.model.ApiResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import java.util.List;

@Component
public class ApiClient {
    private final WebClient webClient;

    public ApiClient(WebClient.Builder builder) {
        this.webClient = builder.baseUrl("https://api.restful-api.dev").build();
    }

    public String getFirstObjectName() {
        List<ApiResponse> objects = webClient.get()
                .uri("/objects")
                .retrieve()
                .bodyToFlux(ApiResponse.class) // Convierte la respuesta en una lista de ApiResponse
                .collectList()
                .block(); // Espera la respuesta de la API

        return (objects != null && !objects.isEmpty()) ? objects.get(0).getName() : "No objects found";
    }
}
