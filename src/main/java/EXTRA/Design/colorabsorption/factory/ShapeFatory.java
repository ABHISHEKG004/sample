package EXTRA.Design.colorabsorption.factory;

import EXTRA.Design.colorabsorption.constants.ShapeType;
import EXTRA.Design.colorabsorption.models.*;

import java.util.List;

/**
 * Created by gaurav.kum on 10/12/17.
 */
public class ShapeFatory {
    public static Shape getShape(Character shapeType, List<Integer> inputs) {
        Shape shape = null;

        if(ShapeType.CIRCLE.getShape().equals(shapeType)) {
            int c1X = inputs.get(0);
            int c1Y = inputs.get(1);
            int radius = inputs.get(2);

            Cordinates cordinates = new Cordinates(c1X, c1Y);
            shape = new Circle(cordinates, radius);
        } else if(ShapeType.SQUARE.getShape().equals(shapeType)) {
            int c1X = inputs.get(0);
            int c1Y = inputs.get(1);
            int c2X = inputs.get(2);
            int c2Y = inputs.get(3);
            int c3X = inputs.get(4);
            int c3Y = inputs.get(5);
            int c4X = inputs.get(6);
            int c4Y = inputs.get(7);


            Cordinates cordinates1 = new Cordinates(c1X, c1Y);
            Cordinates cordinates2 = new Cordinates(c2X, c2Y);
            Cordinates cordinates3 = new Cordinates(c3X, c3Y);
            Cordinates cordinates4 = new Cordinates(c4X, c4Y);
            shape = new Square(cordinates1, cordinates2, cordinates3, cordinates4);
        } else if(ShapeType.RECTANGLE.getShape().equals(shapeType)) {
            int c1X = inputs.get(0);
            int c1Y = inputs.get(1);
            int c2X = inputs.get(2);
            int c2Y = inputs.get(3);
            int c3X = inputs.get(4);
            int c3Y = inputs.get(5);
            int c4X = inputs.get(6);
            int c4Y = inputs.get(7);


            Cordinates cordinates1 = new Cordinates(c1X, c1Y);
            Cordinates cordinates2 = new Cordinates(c2X, c2Y);
            Cordinates cordinates3 = new Cordinates(c3X, c3Y);
            Cordinates cordinates4 = new Cordinates(c4X, c4Y);
            shape = new Rectangle(cordinates1, cordinates2, cordinates3, cordinates4);
        } else if(ShapeType.TRIANGLE.getShape().equals(shapeType)) {
            int c1X = inputs.get(0);
            int c1Y = inputs.get(1);
            int c2X = inputs.get(2);
            int c2Y = inputs.get(3);
            int c3X = inputs.get(4);
            int c3Y = inputs.get(5);

            Cordinates cordinates1 = new Cordinates(c1X, c1Y);
            Cordinates cordinates2 = new Cordinates(c2X, c2Y);
            Cordinates cordinates3 = new Cordinates(c3X, c3Y);
            shape = new Triangle(cordinates1, cordinates2, cordinates3);
        }
        return shape;
    }
}
