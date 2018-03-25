package JavaConcepts.InterfaceImplementation;

/**
 * Created by abhishek.gupt on 25/03/18.
 */
public class Bullet extends Bike {
    @Override
    public void start() {
        System.out.println("Bullet starts");
    }

    @Override
    public void silencer() {
        System.out.println("Bullet silencer");
    }

//    public void highSpeed(){
//        System.out.println("high spedd of bullet");
//    }
}
