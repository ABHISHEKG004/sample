package com.design.lowlevel.others.colorabsorption.utils;

import com.design.lowlevel.others.colorabsorption.constants.HexaDecimal;
import com.design.lowlevel.others.colorabsorption.models.Cordinates;

/**
 * Created by gaurav.kum on 10/12/17.
 */
public class Utils {

    public static double getDistanceBetweenCordinates(Cordinates c1, Cordinates c2) {
        return Math.sqrt((c2.getX() - c1.getX())*(c2.getX() - c1.getX()) +
                ((c2.getY() - c1.getY())*(c2.getY() - c1.getY())));
    }

    public static int getColorFromHex(String hex) {
        return HexaDecimal.getHexadecimal().get(hex.charAt(0)) + HexaDecimal.getHexadecimal().get(hex.charAt(1))*16;
    }
}
