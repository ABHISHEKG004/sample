package DesignPatterns.BuilderPattern;

/**
 * Created by abhishek.gupt on 01/04/18.
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}