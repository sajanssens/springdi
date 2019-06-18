package com.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class OtherDependency {
    public void doSomething() {
        System.out.println("dosomething from " + getClass().getSimpleName());
    }

}
