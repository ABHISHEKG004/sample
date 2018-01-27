package sample;

import java.util.ArrayList;

/**
 * Created by abhishek.gupt on 18/01/18.
 */
public class Driver {


    public static void check(ArrayList<Integer> arr){
        arr.add(234);

    }

    public static void main(String[] args) {
//            Animal animal = new Animal("Abhi", 22);
//            Animal cat = new Cat("Cat", 12);
//            System.out.println(animal);
//            System.out.println(cat);

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(23);
        System.out.println(arr.size());
        check(arr);
        System.out.println(arr.size());
    }
}
