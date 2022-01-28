package BS2;


import BS0.Persona;
import org.springframework.stereotype.Service;

@Service
    public class Servicio implements InterfazPersona2 {

    Persona2 p = new Persona2();


    @Override
    public Persona2 createPersona2(String nombre, String poblacion, int edad) {
        p.setNombre(nombre);
        p.setPoblacion(poblacion);
        p.setEdad(edad);

        return p;

    }

    @Override
    public Persona2 getPersona(Persona persona) {
        return p;
    }
}


