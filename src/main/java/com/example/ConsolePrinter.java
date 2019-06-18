package com.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("console")
public class ConsolePrinter implements PrinterService {
    public void print(String message) {
        System.out.println("Hello " + message);
    }
}