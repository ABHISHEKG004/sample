package EXTRA.IB.DP;

import java.util.ArrayList;

/**
 * Created by abhishek.gupt on 06/12/17.
 */
public class BirthdayParty {



    public static int solve(int dishNo, int cap, ArrayList<Integer> a2, ArrayList<Integer> a3, int[][] dp){

        // Base Case

        if(dishNo<=0 && cap>0){
            return Integer.MAX_VALUE;
        }
        if (cap==0 && dishNo>=0)
            return 0;

        if(dp[dishNo][cap]!=-1){
            return dp[dishNo][cap];
        }

        //System.out.println(dishNo-1 + "   ****");
        if (a2.get(dishNo-1) > cap){

            int ans = solve(dishNo-1, cap, a2,a3,dp);
            dp[dishNo][cap] = ans;
            return ans;
        } else {
            int ans = Math.min(a3.get(dishNo-1) + solve(dishNo, cap - a2.get(dishNo-1), a2,a3, dp),
                    solve(dishNo-1, cap, a2,a3,dp));
            dp[dishNo][cap] = ans;
            return ans;
        }
    }

    public static void main(String[] args) {


        ArrayList<Integer> a1 = new ArrayList<Integer>();// friends capacity
        ArrayList<Integer> a2 = new ArrayList<Integer>();//capacity -dish
        ArrayList<Integer> a3 = new ArrayList<Integer>();//cost -dish

        a1.add(4);
        a1. add(6);

        a2.add(1);
        a2.add(3);

        a3.add(5);
        a3.add(3);
        int fans = 0;
        for(int i=0;i<a1.size();i++){

            int dp[][] = new int[1002][1002];
            int k,j;
            for(k =0;k<1001;k++){
                for(j=0;j<1001;j++){
                    try {
                        dp[k][j] = -1;
                    }catch (Exception e){
                        System.out.printf(e.getMessage());
                        System.out.println(k + " " + j);
                    }
                }
            }
            int ans = solve(a2.size(), a1.get(i), a2,a3, dp);
            fans = fans + ans;
            System.out.println(ans);
        }

        System.out.println(fans);

    }
}
