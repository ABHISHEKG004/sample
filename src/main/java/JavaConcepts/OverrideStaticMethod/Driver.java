package JavaConcepts.OverrideStaticMethod;

/**
 * Created by abhishek.gupt on 25/03/18.
 */
public class Driver {
    public static void main(String[] args){
        //Must explicitly chose Method1 from Class1 or Class2
        System.out.println(Class1.Method1());
        System.out.println(Class2.Method1());
    }
}
