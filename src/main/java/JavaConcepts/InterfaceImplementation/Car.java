package JavaConcepts.InterfaceImplementation;

/**
 * Created by abhishek.gupt on 25/03/18.
 */
public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("car starts");
    }
}
