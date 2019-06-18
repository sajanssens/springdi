package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example")
public class MyConfig {
    // @Bean public PrinterService console() { return new ConsolePrinter(); }
    // @Bean public PrinterService file() { return new FilePrinter(); }
    // @Bean public OtherDependency otherDependency() { return new OtherDependency(); }
    @Bean public Ambiguity ambiguity() { return new Ambiguity("3", 4); }
    // @Bean public Client client(/*PrinterService ps*/) { return new Client(/*ps*/); }
}
