package com.jack.huncho.Trivia.model;

public class CheckAnswerRequest {
    private String answer;
    private Question question;

    public CheckAnswerRequest() {
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
