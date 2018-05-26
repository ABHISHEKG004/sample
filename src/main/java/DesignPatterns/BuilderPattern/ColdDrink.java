package DesignPatterns.BuilderPattern;

/**
 * Created by abhishek.gupt on 01/04/18.
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
