package com.jack.huncho.Trivia.model;

public class CheckAnswer {
    private boolean result;

    public  CheckAnswer(boolean result) {
        this.result = result;
    }

    public CheckAnswer() {

    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
}
