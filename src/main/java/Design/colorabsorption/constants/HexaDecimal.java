package Design.colorabsorption.constants;

import java.util.HashMap;

/**
 * Created by gaurav.kum on 10/12/17.
 */
public class HexaDecimal {
    private static HashMap<Character, Integer> hexadecimal = new HashMap<Character, Integer>() {{
        put('0', 0);
        put('1', 1);
        put('2', 2);
        put('3', 3);
        put('4', 4);
        put('5', 5);
        put('6', 6);
        put('7', 7);
        put('8', 8);
        put('9', 9);
        put('A', 10);
        put('B', 11);
        put('C', 12);
        put('D', 13);
        put('E', 14);
        put('F', 15);
    }};

    public static HashMap<Character, Integer> getHexadecimal() {
        return hexadecimal;
    }
}
