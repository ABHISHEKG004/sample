package sample;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by abhishek.gupt on 18/01/18.
 */
public class Animal {

    String name;
    int age;
//    Hashtable;
//    ConcurrentHashMap;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return (name + " : " + age);
    }
}


