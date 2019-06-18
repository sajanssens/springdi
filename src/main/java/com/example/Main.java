package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("myconfig.xml")) {
        try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class)) {
            // ctx.scan("com.example");
            // ctx.refresh();
            // PrinterService printer = ctx.getBean(PrinterService.class);
            // printer.print("Bram");

            Client client = ctx.getBean("client", Client.class);
            client.usePrinter();

            // Ambiguity ambiguity = ctx.getBean("ambiguity", Ambiguity.class);
            // ambiguity.show();
        }
    }
}
