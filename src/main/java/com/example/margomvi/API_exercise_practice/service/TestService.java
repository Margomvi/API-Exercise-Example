package com.example.margomvi.API_exercise_practice.service;

import com.example.margomvi.API_exercise_practice.client.ApiClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private final ApiClient apiClient;
    private final ObjectMapper objectMapper = new ObjectMapper();

    public TestService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public String processRequest(String one, String two, String three) {
        // Llamamos al nuevo método
        String apiResponse = apiClient.getFirstObjectName();

        return one + two + three + apiResponse;
    }
}
