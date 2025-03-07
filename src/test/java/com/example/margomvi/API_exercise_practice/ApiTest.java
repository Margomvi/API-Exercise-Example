package com.example.margomvi.API_exercise_practice;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import okhttp3.mockwebserver.MockWebServer;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;


@SpringBootTest
@AutoConfigureMockMvc
public class ApiTest {

    // Inicializar el MockWebServer
    private static MockWebServer mockWebServer;

    @BeforeAll
    public static void setUp() throws Exception{
        mockWebServer = new MockWebServer();
        mockWebServer.start();
    }


    // Apagar el MockWebServer
    @AfterAll
    public static void tearDown() throws Exception {
        mockWebServer.shutdown();
    }

    // Usar MockMvc
    @Autowired
    private MockMvc mockMvc;

    private final String jsonContent = "{\"one\":\"A\",\"two\":\"B\",\"three\":\"C \"}";

    @Test
    void test1() throws Exception{
        this.mockMvc.perform(post("/test")
                .contentType(MediaType.APPLICATION_JSON).content(jsonContent))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("{\"result\":\"ABC Google Pixel 6 Pro\"}")));
    }

    // Testear que mandando A B y C me devuelve A B y C + lo que sea


    // Testear que si envío A a nulo me devuelve un error (new feature)

}
