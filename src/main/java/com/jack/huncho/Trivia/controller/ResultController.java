package com.jack.huncho.Trivia.controller;

import com.jack.huncho.Trivia.model.Result;
import com.jack.huncho.Trivia.repository.ResultRepository;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ResultController {
    private static final String BASE_URL = "https://opentdb.com/api.php?amount=5&category=18&difficulty=easy&type=multiple";

    private final ResultRepository repo;

    public ResultController(ResultRepository repo) {
        this.repo = repo;
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @GetMapping("/result")
    Result returnResult(RestTemplate restTemplate) {
        Result result = restTemplate.getForObject(
                BASE_URL, Result.class
        );
        return result;
    }

}
