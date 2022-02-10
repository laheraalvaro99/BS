package BS4;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
//@PropertySource("classpath:application.properties")
public class Variables {

    @Value("${VAR1}")
    private String var1;

    @Value("${My.VAR2}")
    private String var2;

}
