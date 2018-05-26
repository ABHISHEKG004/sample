package DesignPatterns.BuilderPattern;

/**
 * Created by abhishek.gupt on 01/04/18.
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}