package com.example.SB4Perfiles;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Service
@Component
@Profile("Perfil2")
public class Perfil2 implements Perfiles {

    String perfil = "perfil2";


    @Override
    public String getPerfil() {
        return perfil;
    }

    @Override
    public void MyFuncion() {
        System.out.println("2");
    }
}
