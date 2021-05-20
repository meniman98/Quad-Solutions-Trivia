package com.jack.huncho.Trivia;

import com.jack.huncho.Trivia.controller.ResultController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest
class TriviaApplicationTests {

	@Autowired
	private ResultController controller;

	@Autowired
	private MockMvc mvc;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

//	@Test
//	void getAllResults() {
//		this.mvc.perform(get("/result")
//				.contentType(MediaType.APPLICATION_JSON))
//				.andExpect(status().is2xxSuccessful())
//				.andExpect(jsonPath("$", hasSize(5)));
//	}

}
