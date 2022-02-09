package BS3;


import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    String getParam(String param){
        return param;
    }
}
