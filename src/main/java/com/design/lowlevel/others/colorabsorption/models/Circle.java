package com.design.lowlevel.others.colorabsorption.models;

/**
 * Created by gaurav.kum on 10/12/17.
 */
public class Circle implements Shape {
    private Cordinates c;
    private int radius;
    private String color;

    public Circle(Cordinates c, int radius) {
        this.c = c;
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String s) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return radius * radius;
    }

}
