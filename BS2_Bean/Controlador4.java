package com.example.BS2_Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controlador4 {
    @Autowired
    ServicioCiudad servicioCiudad;
    @GetMapping("/controlador4/getCiudades")
    public List<Ciudad> getCiudades(){
        return servicioCiudad.getCiudades();
    }
    }

