package Design.colorabsorption.models;

import Design.colorabsorption.utils.Utils;

/**
 * Created by gaurav.kum on 10/12/17.
 */
public class Square implements Shape {
    private Cordinates c1;
    private Cordinates c2;
    private Cordinates c3;
    private Cordinates c4;
    private String color;

    public Square(Cordinates c1, Cordinates c2, Cordinates c3, Cordinates c4) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
    }

    @Override
    public double getArea() {
        double side = Utils.getDistanceBetweenCordinates(c1, c2);
        return side*side;
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
