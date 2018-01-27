package EXTRA.Design.colorabsorption.driver;

import EXTRA.Design.colorabsorption.models.Shape;
import EXTRA.Design.colorabsorption.constants.ShapeType;
import EXTRA.Design.colorabsorption.exceptions.InvalidTypeException;
import EXTRA.Design.colorabsorption.factory.ShapeFatory;
import EXTRA.Design.colorabsorption.models.*;
import EXTRA.Design.colorabsorption.service.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by gaurav.kum on 10/12/17.
 */
public class Driver {
    public static void main(String[] args) throws InvalidTypeException {
        Scanner sc = new Scanner(System.in);
        int dimensionX = sc.nextInt();
        int dimensionY = sc.nextInt();
        String boardColor = sc.next();

        int n = sc.nextInt();
        char c = sc.next().charAt(0);
        String color = null;
        List<Integer> inputList = new ArrayList<>();
        while(sc.hasNext()) {
            String input = sc.next();
            if(input.startsWith("#")) {
                color = input;
                break;
            }
            inputList.add(Integer.parseInt(input.trim()));
        }
        Shape shape = ShapeFatory.getShape(c, inputList);
        if(shape == null) {
            throw new InvalidTypeException("Type not supported");
        }
        shape.setColor(color);

        System.out.println(Service.getAbsorbedColor(shape, color));

    }
}
