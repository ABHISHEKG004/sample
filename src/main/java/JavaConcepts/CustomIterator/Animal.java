package JavaConcepts.CustomIterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by abhishek.gupt on 24/03/18.
 */

public class Animal implements Iterable<String> {

    private ArrayList<String> animal = new ArrayList<String>();

    public Animal(ArrayList animal){
        this.animal = animal;
    }

    public ArrayList getAnimal() {
        return animal;
    }

    @Override
    public Iterator<String> iterator() {
        return new AnimalIterator(this);
    }

}