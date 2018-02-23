package JavaConcepts.Inheritance;

/**
 * Created by abhishek.gupt on 18/01/18.
 */
public class Animal {

    String name;
    int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return (name + " : " + age);
    }
}


