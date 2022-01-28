package BS2;


import BS0.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class Controlador2 {
    @Autowired
    Servicio servicio;
    @PostMapping("/controlador2/getPersona")
    public Persona2 getPersonaNueva(@RequestBody Persona persona){
        Persona2 p = (Persona2) servicio.getPersona(persona);
        p.setEdad(p.getEdad()*2);
        return p;

        //public Persona2 getPersona(@RequestHeader(value = "nombre")String nombre, @RequestHeader(value = "edad")int edad, @RequestHeader(value = "poblacion")String poblacion){
          //  return servicio.createPersona2(nombre, poblacion, edad);
        //}
    }


}
