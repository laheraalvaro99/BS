package BS3;

import RS1.DemoApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class application {


    public static void main(String[] args) {
        SpringApplication.run(application.class, args);
    }

    @PostConstruct
    public void llamada(){

        System.out.println("Hola desde la clase inicial");
    }

    @Bean
    CommandLineRunner ejecutame1(){
    return p->{
        System.out.println("Hola desde la clase secundaria");
    };
    }

    @Bean
    CommandLineRunner ejecutame2(){

        return p->{
            System.out.println("Soy la tercera clase");
        };
    }

    @Bean
    CommandLineRunner ejecutame3(){
        Controller c= new Controller();
        return p->{
            System.out.println(c.getParam("Mensaje pasado por parametro"));
        };
    }









}
