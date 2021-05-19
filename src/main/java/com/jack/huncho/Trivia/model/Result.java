package com.jack.huncho.Trivia.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {

    public Integer responseCode;
    public List<Result> results = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
