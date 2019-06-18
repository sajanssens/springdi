package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import java.util.List;

@Component
public class Client {

    @Autowired
    private javax.inject.Provider<OtherDependency> otherDependencyProvider;


    @Inject
    @Qualifier("file")
    private PrinterService printerService;
    // private OtherDependency otherDependency;

    @Autowired
    private List<PrinterService> printerServices;

    // public Client() {
    // }
    //
    // public Client(PrinterService ps) {
    //     this.printerService=ps;
    // }

    // public Client(PrinterService printerService/*, OtherDependency otherDependency*/) {
    //     this.printerService = printerService;
    //     // this.otherDependency = otherDependency;
    // }

    public void usePrinter() {
        this.printerService.print("I'm the Client!");
        OtherDependency otherDependency = otherDependencyProvider.get();
        otherDependency.doSomething();

        printerServices.forEach(ps -> ps.print("Multi"));
    }

    @Lookup
    private OtherDependency getOtherDependency() {
        return null;
    }

    // public void setPrinterService(PrinterService printerService) {
    //     this.printerService = printerService;
    // }

    @PreDestroy
    private void kill() {
        System.out.println("kill");
    }

    @PostConstruct
    private void init() {
        System.out.println("init");
    }

    // public void setOtherDependency(OtherDependency ooooooooooo) {
    //     this.otherDependency = ooooooooooo;
    // }
}
