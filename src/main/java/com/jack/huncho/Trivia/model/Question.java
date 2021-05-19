package com.jack.huncho.Trivia.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question {

    public String category;
    public String type;
    public String difficulty;
    public String question;
    public String correctAnswer;
    public List<String> incorrectAnswers = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
