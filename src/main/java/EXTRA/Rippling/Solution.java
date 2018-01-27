package EXTRA.Rippling;

import java.util.ArrayList;

/**
 * Created by abhishek.gupt on 29/12/17.
 */


class Song{

    public int time;
    public String name;

    public Song(int time, String name){
        this.time = time;
        this.name = name;
    }

}


public class Solution {

    static ArrayList<Song> ans;

    static int getPlaylist(int n, ArrayList<Song> list, int songIndex, int[][][] dp){
        if(n<0){
            return -1000000;
        }

        if(n>0 && songIndex==-1){
            return -1000000;
        }

        if(n==0){

//            if(ans.size()<solution.size()) {
//                ans = new ArrayList<Song>(solution);
//            }

            return 0;
        }

        if(dp[n][songIndex][0]!=-1){
            return dp[n][songIndex][0];
        }
        int currentTime = list.get(songIndex).time;

        if(n>=currentTime){
//            solution.add(list.get(songIndex));
            int val1 = 1  + getPlaylist(n-currentTime, list, songIndex-1, dp);
//            solution.remove(solution.size()-1);
            int val2 = getPlaylist(n, list, songIndex-1, dp);

            int mx = Math.max(val1,val2);
            if(mx==val1){
                dp[n][songIndex][1]=1;
            }else{
                dp[n][songIndex][1]=0;
            }
            dp[n][songIndex][0] = mx;
            return dp[n][songIndex][0];
        }else{
            int val = getPlaylist(n, list, songIndex-1, dp);
            dp[n][songIndex][0] = val;
            dp[n][songIndex][1] = 0;
            return dp[n][songIndex][0];
        }

    }


    public static void main(String[] args) {


        ArrayList<Song> list = new ArrayList<Song>();

        list.add(new Song(2, "A1"));
        list.add(new Song(1, "A2"));
        list.add(new Song(5, "A3"));
        list.add(new Song(3, "A4"));
        list.add(new Song(4, "A5"));

        int n = 10;

        int m= list.size();
        int[][][] dp = new int[n+1][m+1][2];

        for(int i=0;i<=n;i++){
            for(int j=0;j<m;j++){
                dp[i][j][0] = -1;
            }
        }

        ans = new ArrayList<Song>();

//        ArrayList<Song> solution = new ArrayList<Song>();

        int ans_val = getPlaylist(n, list, m-1, dp);

        System.out.println(ans_val);
//        for(int i = 0;i<ans.size();i++){
//            System.out.println(ans.get(i).name);
//        }

        while(true){
            if(n<=0 || m<=0){
                break;
            }
            if(dp[n][m-1][1]==1){
                System.out.println(list.get(m-1).name + " : " +  list.get(m-1).time);
                n=n-list.get(m-1).time;
                m=m-1;
            }else{
                m=m-1;
            }
        }

    }

}
