package com.usa.ejemplo1.Controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Ejemplo1")
public class Controlador {


    @GetMapping ("/mensaje")
    public String mensaje(){
        return "Enviando mensaje de Bienvenida....";
    }
}
