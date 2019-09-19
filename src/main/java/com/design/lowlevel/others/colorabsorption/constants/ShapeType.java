package com.design.lowlevel.others.colorabsorption.constants;

/**
 * Created by gaurav.kum on 10/12/17.
 */
public enum ShapeType {
    CIRCLE('C'),
    SQUARE('S'),
    RECTANGLE('R'),
    TRIANGLE('T');

    private Character shape;
    ShapeType(Character shape) {
        this.shape = shape;
    }

    public Character getShape() {
        return shape;
    }
}
