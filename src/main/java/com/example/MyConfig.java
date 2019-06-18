package com.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example")
public class MyConfig {
    // @Bean public PrinterService printerService() { return new ConsolePrinter(); }
    // @Bean public Client client(PrinterService ps) { return new Client(/*ps*/); }
}
