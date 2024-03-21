package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller {

    @GetMapping("/servicio2")
    public String service2() {
        return "Servicio 2 completado";
    }
}
