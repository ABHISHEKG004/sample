package JavaConcepts.InterfaceImplementation;

/**
 * Created by abhishek.gupt on 25/03/18.
 */
public class ApacheRTR extends Bike {


    @Override
    public void silencer() {
        System.out.println("apacheRTR silencer");
    }

    @Override
    public void start() {
        System.out.println("apacheRTR starts");
    }

    public void highSpeed(){
        System.out.println("high speed of apacheRTR");
    }

}
