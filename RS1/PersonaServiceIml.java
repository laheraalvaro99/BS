package RS1;


import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class PersonaServiceIml implements PersonaService{


    public Map<Integer, Persona> listaPersona = new HashMap<>();

    Integer count=1;

    @Override
    public Map<Integer, Persona> getAll() {
        return listaPersona;
    }

    @Override
    public Persona getByIdAndName(String id) {
        Persona p1 = new Persona();

        String num= "0123456789";

        boolean tieneNum= false;

        for( int i = 0; i<id.length();i++){
            if(num.indexOf(id.charAt(i),0)!=-1){
                tieneNum = true;
            }else{
                tieneNum = false;
            }
        }

        if (tieneNum){
            Integer n = Integer.parseInt(id);
            Persona p=listaPersona.get(n);
            p1 = p;
        }else{
            Collection<Persona> keys = listaPersona.values();

            for (Persona key : keys) {
                if (key.getNombre().equals(id)) {
                    Persona p = key;
                    p1 = p;
                }
            }
        }
        return p1;

    }

    @Override
    public Persona addPersona(Persona persona) {

        listaPersona.put(count, persona);
        count++;

        return persona;
    }

    @Override
    public Persona borrarPersona(Integer id) {
        Persona p = listaPersona.get(id);
        listaPersona.remove(id);
        return p;
    }

    @Override
    public Persona modificarPersona(Integer id, Persona persona) {
        if (persona.getNombre() != null){
            listaPersona.get(id).setNombre(persona.getNombre());
        }
        if (persona.getEdad() != null){
            listaPersona.get(id).setEdad(persona.getEdad());
        }
        if (persona.getPoblacion() != null){
            listaPersona.get(id).setPoblacion(persona.getPoblacion());
        }

        return persona;

    }

}
