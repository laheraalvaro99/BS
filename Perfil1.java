package BS4Perfiles;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service
@Component
@Profile("perfil1")
public class Perfil1 implements Perfiles {

    private static final String Perfil1 = "THIS IS FROFILE ONE";

    String perfil = "perfil1";


    @Override
    public String getPerfil() {
        return perfil;
    }

    @Override
    public void MyFuncion() {

        System.out.println("1");
    }
}
