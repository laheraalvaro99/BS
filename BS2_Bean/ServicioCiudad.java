package com.example.BS2_Bean;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicioCiudad {

    List<Ciudad> listaCiudad = new ArrayList<>();

    public void addCiudad(String nombre, Integer numHabitantes){
        Ciudad c = new Ciudad();

        c.setNombre(nombre);
        c.setNumeroHabitantes(numHabitantes);

        listaCiudad.add(c);
    }

    public List<Ciudad> getCiudades(){
        return listaCiudad;
    }
}
