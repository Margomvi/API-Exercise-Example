package com.example.margomvi.API_exercise_practice;

import com.example.margomvi.API_exercise_practice.client.ApiClient;
import com.example.margomvi.API_exercise_practice.controller.TestController;
import com.example.margomvi.API_exercise_practice.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class ApiExercisePracticeApplicationTests {

	// Vamos a testear que los beans existen
	// Y vamos a hacerlo de dos formas.
	// Primera forma, con autowired:

	@Autowired
	TestService testService;

	@Autowired
	TestController testController;

	@Autowired
	ApiClient apiClient;

	@Test
	void testControllerBeanExists() {
		assertThat(testController).isNotNull();
	}

	@Test
	void testServiceBeanExists() {
		assertThat(testService).isNotNull();
	}

	@Test
	void testApiClientBeanExists() {
		assertThat(apiClient).isNotNull();
	}

	// -----------------------------------------------------------------------------------
	// Segunda forma: Cargando el contexto
	@Autowired
	ApplicationContext ctx;

	@Test
	void testServiceBeanExistsContext() {
		testService = ctx.getBean(TestService.class);
		assertThat(testService).isNotNull();
	}

	@Test
	void testControllerBeanExistsContext() {
		testController = ctx.getBean(TestController.class);
		assertThat(testController).isNotNull();
	}

	@Test
	void testApiClientBeanExistsContext() {
		apiClient = ctx.getBean(ApiClient.class);
		assertThat(apiClient).isNotNull();
	}


}
