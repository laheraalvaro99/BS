package com.example.BS2_Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controlador3 {

    @Autowired
    ServicioCiudad servicioCiudad;

    @PostMapping("/controlador3/addCiudad")
    public void construirCiudad(@RequestHeader(value = "nombre") String nombre, @RequestHeader(value = "numHabitantes")
                                Integer numHabitantes){
        servicioCiudad.addCiudad(nombre,numHabitantes);
    }


}
