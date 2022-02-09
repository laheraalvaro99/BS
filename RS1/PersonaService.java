package RS1;

import java.util.Map;

public interface PersonaService {


    Map<Integer,Persona> getAll();

    Persona getByIdAndName(String id);
    Persona addPersona(Persona persona);
    Persona borrarPersona(Integer id);
    Persona modificarPersona(Integer id, Persona persona);
}
