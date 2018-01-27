package EXTRA.DESHAW;

/**
 * Created by abhishek.gupt on 15/12/17.
 */
public class Solution {

    static String getValue(long ch){
        String ans = String.valueOf(ch);

        String revAns = new StringBuilder(ans).reverse().toString();

        return ans + revAns;
    }


    static String[] calculate(long[] prices) {

        int k = prices.length;

        String[] ab = new String[k];
        for(int i=0;i<k;i++){
            long ch = (prices[i]+1)/2;
            ab[i] = getValue(ch);
            System.out.println(ab[i]);
        }
        //System.out.println(ab[0]);
        return ab;
    }

    public static void main(String[] args) {

        long[] abc = new long[5];
        abc[0] = 11;
        abc[1] = 4;
        abc[2] = 15;
        abc[3] = 21;
        abc[4] = 103;
        calculate(abc);

    }
}
