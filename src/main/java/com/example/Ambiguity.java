package com.example;

import org.springframework.stereotype.Component;

// @Component
public class Ambiguity {

    private final String message;
    private final int number;

    public Ambiguity(String s, int i) {
        this.message = s;
        this.number = i;
    }

    public void show() {
        System.out.println(this);
    }

    @Override public String toString() {
        return "Ambiguity{" +
                "message='" + message + '\'' +
                ", number=" + number +
                '}';
    }
}
