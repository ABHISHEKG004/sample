package EXTRA.Algorythma;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by abhishek.gupt on 17/12/17.
 */
public class Second {


    private static boolean func(ArrayList<ArrayList<Integer>> abh, int index, boolean[] vis, int[] arr){
        if(arr[index] == 0)
            return false;
        vis[index] = true;;

        for(int i=0; i<abh.get(index).size();i++){
            if(func(abh, abh.get(index).get(i),vis,arr)==false)
                return false;
        }
        vis[index] = false;
        return true;
    }

    public static void solve(){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int t = obj.nextInt();
        int i;
        int[] arr = new int[n];

        ArrayList<ArrayList<Integer>> abh = new ArrayList<ArrayList<Integer>>();
        for(i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
            abh.add(new ArrayList<Integer>());
        }

        while(t>0) {
            t--;
            int a = obj.nextInt();
            int b = obj.nextInt();
            a=a-1;
            b=b-1;
            abh.get(a).add(b);
        }
        boolean[] vis = new boolean[n];
        for(i = 0; i < n; i++) {
            if(func(abh,i, vis, arr)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static void main(String[] args) {
        solve();
    }

}
