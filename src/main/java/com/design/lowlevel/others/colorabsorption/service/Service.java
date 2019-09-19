package com.design.lowlevel.others.colorabsorption.service;

import com.design.lowlevel.others.colorabsorption.models.Shape;
import com.design.lowlevel.others.colorabsorption.utils.Utils;

/**
 * Created by gaurav.kum on 10/12/17.
 */
public class Service {
    public static double getAbsorbedColor(Shape shape, String color) {
        double area = shape.getArea();

        String red = color.substring(1, 3);
        String green = color.substring(3, 5);
        String blue = color.substring(5, 7);

        double redColorVal = Utils.getColorFromHex(red);
        double greenColorVal = Utils.getColorFromHex(green);
        double blueColorVal = Utils.getColorFromHex(blue);

        double redColorAbsorbed = (1.0 - redColorVal/255) * area;
        double greenColorAbsorbed = (1.0 - greenColorVal/255) * area;
        double blueColorAbsorbed = (1.0 - blueColorVal/255) * area;

        double maxValue = Math.max(redColorAbsorbed, Math.max(greenColorAbsorbed, blueColorAbsorbed));
        double minValue = Math.min(redColorAbsorbed, Math.min(greenColorAbsorbed, blueColorAbsorbed));

        return minValue/maxValue;
    }
}
