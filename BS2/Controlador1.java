package BS2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controlador1 {
    @Autowired
    Servicio servicio;
    @GetMapping("/controlador1/addPersona")
    public Persona2 getPersona(@RequestHeader(value = "nombre")String nombre, @RequestHeader(value = "edad")int edad, @RequestHeader(value = "poblacion")String poblacion){
        return servicio.createPersona2(nombre, poblacion, edad);
    }

}
