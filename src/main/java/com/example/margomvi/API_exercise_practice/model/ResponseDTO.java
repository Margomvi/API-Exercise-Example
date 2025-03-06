package com.example.margomvi.API_exercise_practice.model;

public class ResponseDTO {
    private String result;

    public ResponseDTO(String result) {
        this.result=result;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
