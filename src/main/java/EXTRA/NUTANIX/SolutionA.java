package EXTRA.NUTANIX;

import java.util.Stack;

/**
 * Created by abhishek.gupt on 07/01/18.
 */

class Node{
    int val;
    int ind;

    Node(int val, int ind){
        this.val = val;
        this.ind = ind;
    }
}
public class SolutionA {

    static void finalPrice(int[] prices) {

        int n = prices.length;
//        int[] right = new int[n];
//        right[n-1] = prices[n-1];
//        for(int i = n-1;i>=0;i--){
//            right
//        }

        int tot = 0;

        for(int i =0;i<n;i++){
            tot = tot + prices[i];
        }

        Stack<Node> st = new Stack<Node>();
        int i = 0;
        int sum = 0;
        while(i<n){
            if(st.empty() || prices[i]>st.peek().val){
                st.push(new Node(prices[i], i));
            }else{
                while(st.peek().val>=prices[i]) {

                    sum = sum + prices[i];
                    st.pop();

                    if(st.empty()){
                        break;
                    }
                }
                st.push(new Node(prices[i], i));
            }
            i++;
        }

        //while(st.peek())
        //System.out.println(sum);
        System.out.println(tot-sum);



        Stack<Integer> sta = new Stack<Integer>();

        while(!st.empty()){
            sta.push(st.peek().ind);
            st.pop();
        }

        while(!sta.empty()) {
            System.out.println(sta.peek());
            sta.pop();
        }

        }

    public static void main(String[] args) {

        int n = 5;
        int[] ar = new int[n];
//        ar[0]=5;
//        ar[1]=1;
//        ar[2]=3;
//        ar[3]=4;
//        ar[4]=6;
//        ar[5]=2;

        ar[0]=1;
        ar[1]=2;
        ar[2]=3;
        ar[3]=4;
        ar[4]=5;
        //ar[5]=2;

        finalPrice(ar);


    }
}
