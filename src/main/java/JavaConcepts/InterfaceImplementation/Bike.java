package JavaConcepts.InterfaceImplementation;

/**
 * Created by abhishek.gupt on 25/03/18.
 */
public abstract class Bike implements Vehicle {

    public abstract void silencer();

    public void highSpeed(){
        System.out.println("High speed of bike");
    }
}
