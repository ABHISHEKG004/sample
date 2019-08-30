package EXTRA.UBER;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by abhishek.gupt on 03/02/18.
 */

public class EasyUberCount {

    public static void main(String[] args) {
        new EasyUberCount().func();
    }

    private class Pair {
        Long a;
        Long b;
    }

    public void func() {

        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        List<Pair> pairs = new ArrayList<>();

        for(int i=0;i<n;i++) {
            Pair pr = new Pair();
            pr.a = sc.nextLong();
            pr.b = sc.nextLong();
            pairs.add(pr);
        }

//        pairs.sort((o1, o2) -> (o1.a < o2.a ? -1 : 1));
        Long curr = -1000000009L;
        Long count = 0L;

        for (Pair pr : pairs) {
            //System.out.println(pr.a + " " + pr.b);
            if (pr.b <= curr) {
            }
            else if (pr.a > curr) {
                count = count + (pr.b - pr.a + 1);
                curr = pr.b;
            }
            else {
                count = count + (pr.b - curr);
                curr = pr.b;
            }
        }

        System.out.println(count);
    }
}
