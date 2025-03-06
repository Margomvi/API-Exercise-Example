package com.example.margomvi.API_exercise_practice.controller;

import com.example.margomvi.API_exercise_practice.model.RequestDTO;
import com.example.margomvi.API_exercise_practice.model.ResponseDTO;
import com.example.margomvi.API_exercise_practice.service.TestService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {
    private final TestService testService;

    public TestController(TestService testService){
        this.testService = testService;
    }

    @PostMapping
    public ResponseDTO testEndpoint(@RequestBody RequestDTO request) {
        String result = testService.processRequest(request.one(),request.two(),request.three());

        return new ResponseDTO(result);
    }
}
