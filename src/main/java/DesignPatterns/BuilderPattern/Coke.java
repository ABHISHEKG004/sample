package DesignPatterns.BuilderPattern;

/**
 * Created by abhishek.gupt on 01/04/18.
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
