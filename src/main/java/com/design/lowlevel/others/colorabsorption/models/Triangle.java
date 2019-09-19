package com.design.lowlevel.others.colorabsorption.models;

import com.design.lowlevel.others.colorabsorption.utils.Utils;

/**
 * Created by gaurav.kum on 10/12/17.
 */
public class Triangle implements Shape {
    private Cordinates c1;
    private Cordinates c2;
    private Cordinates c3;
    private String color;

    public Triangle(Cordinates c1, Cordinates c2, Cordinates c3) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    @Override
    public double getArea() {
        double a = Utils.getDistanceBetweenCordinates(c1, c2);
        double b = Utils.getDistanceBetweenCordinates(c2, c3);
        double c = Utils.getDistanceBetweenCordinates(c3, c1);

        double p = (a + b + c)/2;

        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
