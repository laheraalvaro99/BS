package BS0;

import org.springframework.web.bind.annotation.*;

@RestController
public class BS0 {

    @GetMapping("/user/{nombre}")
    public String Hola(@PathVariable String nombre) {
        return "hola " + nombre;
    }
    @PostMapping ("/useradd")
    public Persona Useradd(@RequestBody Persona persona) {

        persona.setEdad(persona.getEdad()+1);
        return persona;
    }

}
