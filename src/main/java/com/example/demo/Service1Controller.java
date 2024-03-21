package com.example.demo;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1Controller {

    @PostMapping("/servicio1")
    @Bulkhead(name = "service1Bulkhead", fallbackMethod = "fallback")
    public void serivce1() throws InterruptedException {
        this.tareapesada();
    }

    public void fallback() {
        System.out.println("Fallback");
    }

    public void tareapesada() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Realizando microservicio...");
        Thread.sleep(1000);
    }
}

