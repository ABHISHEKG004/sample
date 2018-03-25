package JavaConcepts.CustomIterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by abhishek.gupt on 24/03/18.
 */

public class TestIterator {

    public static void main(String args[]) {
        ArrayList<String> animalList = new ArrayList();
        animalList.add("Horse");
        animalList.add("Lion");
        animalList.add("Tiger");
        Animal animal = new Animal(animalList);

        System.out.println("---------Using For Each--------");
        for (String animalObj : animal) {
            System.out.println(animalObj);
        }

        System.out.println("---------Using Iterator--------");
        Iterator itr = animal.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}