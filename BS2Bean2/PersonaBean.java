package BS2Bean2;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service @Data
public class PersonaBean {

    @Bean
    @Qualifier("bean1")
    public String getBean1(){
        return "bean1";
    }
    @Bean
    @Qualifier("bean2")
    public String getBean2(){
        return "bean2";
    }
    @Bean
    @Qualifier("bean3")
    public String getBean3(){
        return "bean3";
    }

}
