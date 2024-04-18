package pl.pjatk.mar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ComponentOne {
    public ComponentOne(@Value("${my.own.prop}") String valueFromProperties){
        System.out.println("component 1 " + valueFromProperties);
    }
    public void printComponent(){
        System.out.println("This is component 1 from applicationContext method");
    }
}
