package DesignPatterns.BuilderPattern;

/**
 * Created by abhishek.gupt on 01/04/18.
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}