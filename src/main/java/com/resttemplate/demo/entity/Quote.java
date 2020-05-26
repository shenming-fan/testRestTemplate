package com.resttemplate.demo.entity;

import java.util.Map;

public class Quote {
    private String type;
    private Map<String,String> message;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String, String> getMessage() {
        return message;
    }

    public void setMessage(Map<String, String> message) {
        this.message = message;
    }
}
