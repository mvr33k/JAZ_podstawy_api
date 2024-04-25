package pl.pjatk.mar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;


import java.util.*;

@Configuration
public class ConfigClass {

    @Bean
    public SomeClass someClass(){
        return new SomeClass();
    }

    @Bean
    public List<String> defaultData(){
        return List.of("s1", "s2", "s3", "s4", "s5");
    }

    @Bean
    @ConditionalOnProperty(name = "custom.property", havingValue = "true")
    public SomeClass varBean(){
        return null;
    }



//    @Bean
//    public void RandomBean(@Value("${my.own.prop}") String valueFromProperties){
//        System.out.println(valueFromProperties);
//    }


}
