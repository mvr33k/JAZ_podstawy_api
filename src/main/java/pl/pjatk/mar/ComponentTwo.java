package pl.pjatk.mar;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwo {
    public ComponentTwo(ComponentOne componentOne, ForProperties forProperties){
//        System.out.println("component 2 ");
        System.out.println(forProperties.getCredentials().getUser());
        System.out.println(forProperties.getCredentials().getPassword());
        System.out.println(forProperties.getLoginUrl());
        componentOne.printComponent();
    }
    public void printComponent(){
        System.out.println("This is component 2 from applicationContext method");
    }

}
