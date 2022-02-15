package BS4Perfiles;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationPropertiesScan
public class Controlador {

    @Value("${url}")
    String url;
    @Value("${password}")
    String password;

    @Autowired
    Conf config;

    @Autowired
    Perfiles perfiles;

    @GetMapping("/parameters")
    public String getParameters() {
        return "url: " + url + " password: " + password;
    }

    @GetMapping("/conf")
    public String getValue() {
        String var1 = config.getVar1();
        String var2 = config.getVar2();

        return var1 + " " + var2;
    }

    @GetMapping("/perfil")
    public Perfiles getProfile() {
        return perfiles;
    }

}
