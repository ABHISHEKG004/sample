package JavaConcepts.InterfaceImplementation;

/**
 * Created by abhishek.gupt on 25/03/18.
 */
public class Driver {
    public static void main(String[] args) {
        Bike bike = new ApacheRTR();
        bike.silencer();
        bike.start();
        bike.highSpeed();

        Bike bike1 = new Bullet();
        bike1.silencer();
        bike1.start();
        bike1.highSpeed();
    }
}
