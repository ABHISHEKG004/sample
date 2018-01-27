package EXTRA.GRAB;

/**
 * Created by abhishek.gupt on 04/01/18.
 */
public class Solution {

    public static int solution(int[] A){

        int i,j,k;
        k=A.length;
        if(k>=23){
            return 25;
        }

        if(k<=3){
            return k*2;
        }

        boolean[] has = new boolean[31];
        for(i=0;i<k;i++){

            has[A[i]] = true;

        }

        int[] dp = new int[31];

        dp[0] = 0;
        for (int day = 1; day <= 30; day++) {
            if (! has[day]) {
                dp[day] = dp[day-1];
                continue;
            }

            int minCost;
            minCost = dp[day-1] + 2;
            for (int prev = Math.max(0, day - 7); prev <= day - 4; prev++) {
                minCost = Math.min(minCost, dp[prev] + 7);
            }
            minCost = Math.min(minCost, 25);

            dp[day] = minCost;
            //System.out.println(day + " : " + dp[day]);
        }

        return dp[30];
    }
    public static void main(String[] args) {
//        int[] A = new int[7];
//        A[0]=1;
//        A[1]=2;
//        A[2]=4;
//        A[3]=5;
//        A[4]=7;
//        A[5]=29;
//        A[6]=30;

        int[] A = {1,7,8,9,10,15,16,17,18,21,25};

        int ans = solution(A);
        System.out.println(ans);

    }
}
