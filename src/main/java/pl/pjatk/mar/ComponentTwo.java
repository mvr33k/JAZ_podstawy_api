package pl.pjatk.mar;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwo {
    public ComponentTwo(ComponentOne componentOne){
        System.out.println("component 2 ");
        componentOne.printComponent();
    }
    public void printComponent(){
        System.out.println("This is component 2 from applicationContext method");
    }

}
