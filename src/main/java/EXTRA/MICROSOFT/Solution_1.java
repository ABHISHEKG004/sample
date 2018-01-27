package EXTRA.MICROSOFT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by abhishek.gupt on 25/01/18.
 */
public class Solution_1 {

    static String ORDER ;
    static String[] sortStrings(String arr[], String languageOrder) {
        ORDER = languageOrder;
        if (arr == null || arr.length == 0 || languageOrder == null) {
            return new String[0];
        }
        List<NewLangString> newLangStrings = new ArrayList<>();
        for (int i = 0; i < arr.length; i ++) {
            if (!arr[i].contains("J")) {
                newLangStrings.add(new NewLangString(arr[i]));
            }
        }
        Collections.sort(newLangStrings);
        String ret[] = new String[newLangStrings.size()];
        for (int i = 0; i < newLangStrings.size(); i ++) {
            ret[i] = newLangStrings.get(i).str;
        }
        return ret;
    }


    static class NewLangString implements Comparable<NewLangString>{
        String str;
        public NewLangString(String str) {
            this.str = str;
        }
        @Override
        public int compareTo(NewLangString o) {
            int len1 = str.length();
            int len2 = o.str.length();
            int lim = Math.min(len1, len2);
            char v1[] = str.toCharArray();
            char v2[] = o.str.toCharArray();

            int k1 = 0, k2 = 0;
            while (k1 < len1 && k2 < len2) {
                String c1 = v1[k1] + "";
                String c2 = v2[k2] + "";
                if (c1.equals(c2)) {
                    if (k1 + 1 < lim) {
                        if (v1[k1 + 1] == 'k') {
                            c1 = "Dk";
                            k1++;
                        }
                        if (v2[k2 + 1] == 'k') {
                            c2 = "Dk";
                            k2++;
                        }
                    }
                    return ORDER.indexOf(c1) - ORDER.indexOf(c2);
                }
                k1++;
                k2++;
            }
            return len1 - len2;

        }
    }

}
