package com.example;

public class Ambiguity {

    private final String message;
    private final int number;

    public Ambiguity(String s, int i) {
        this.message = s;
        this.number = i;
    }

    public void show() {
        System.out.println(message + number);
    }
}
