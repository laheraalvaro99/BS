package BS4;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ControllerImp {


    @Autowired
    Variables variables;


    public String returnVar(String valor){
        String var;

        if(valor.equals("VAR1")){
            var= variables.getVar1();
        }else if(valor.equals("My.VAR2")){
            var = variables.getVar2();
        }else{
            var=valor + " no tiene valor asignado";
        }


        return var;
    }
}
