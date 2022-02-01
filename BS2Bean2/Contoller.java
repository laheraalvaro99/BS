package BS2Bean2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class Contoller {
    @Autowired
    @Qualifier("bean1")
    PersonaBean p1;

    @Autowired
    @Qualifier("bean2")
    PersonaBean p2;

    @Autowired
    @Qualifier("bean3")
    PersonaBean p3;

    @GetMapping("/controller/bean/{bean}")
    public String getNombre(@PathVariable String bean){
        switch (bean){
            case "bean1":
                return p1.getBean1();

            case "bean2":
                return p1.getBean2();

            case "bean3":
                return p3.getBean3();



        }
        return "null";
    }
}
