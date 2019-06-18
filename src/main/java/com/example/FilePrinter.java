package com.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("file")
public class FilePrinter implements PrinterService {
    public void print(String message) {
        System.out.println("Printing to file: " + message);
    }
}