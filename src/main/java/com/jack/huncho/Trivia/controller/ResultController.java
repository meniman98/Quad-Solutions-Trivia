package com.jack.huncho.Trivia.controller;

import com.jack.huncho.Trivia.model.CheckAnswer;
import com.jack.huncho.Trivia.model.CheckAnswerRequest;
import com.jack.huncho.Trivia.model.Question;
import com.jack.huncho.Trivia.model.Result;
import com.jack.huncho.Trivia.repository.ResultRepository;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ResultController {
    private static final String BASE_URL = "https://opentdb.com/api.php?amount=5&category=18&difficulty=easy&type=multiple";
    private static final String QUESTIONS = "/questions";
    private static final String CHECK_ANSWER = "/checkanswer";

    private ResultRepository repo;

    ResultController() {

    }

    ResultController(ResultRepository repo) {
        this.repo = repo;
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @GetMapping(QUESTIONS)
    Result returnResult(RestTemplate restTemplate) {
        return restTemplate.getForObject(
                BASE_URL, Result.class
        );

    }


    @PostMapping(CHECK_ANSWER)
    CheckAnswer checkAnswer(@RequestBody CheckAnswerRequest request) {
        if (request.getAnswer().equals(request.getQuestion().correct_answer)) {
            return new CheckAnswer(true);
        }
        else {
            return new CheckAnswer(false);
        }
    }




}
