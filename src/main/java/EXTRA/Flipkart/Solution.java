package EXTRA.Flipkart;

import java.util.HashMap;

/**
 * Created by abhishek.gupt on 15/12/17.
 */
public class Solution {


    int maxLen(int arr[], int n)
    {
        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

        int sum = 0;
        int max_len = 0;
        int ending_index = -1;
        int start_index = 0;

        for (int i = 0; i < n; i++)
        {
            arr[i] = (arr[i] == 0) ? -1 : 1;
        }

        for (int i = 0; i < n; i++)
        {
            sum += arr[i];

            if (sum == 0)
            {
                max_len = i + 1;
                ending_index = i;
            }

            if (hM.containsKey(sum+n))
            {
                if (max_len < i - hM.get(sum + n))
                {
                    max_len = i - hM.get(sum + n);
                    ending_index = i;
                }
            }
            else
                hM.put(sum + n, i);
        }

        for (int i = 0; i < n; i++)
        {
            arr[i] = (arr[i] == -1) ? 0 : 1;
        }

        int end = ending_index - max_len + 1;

        return max_len;
    }

//        int findSubArray(int arr[], int n)
//        {
//            int sum = 0;
//            int maxsize = -1, startindex = 0;
//            int endindex = 0;
//
//            for (int i = 0; i < n - 1; i++)
//            {
//                sum = (arr[i] == 0) ? -1 : 1;
//                for (int j = i + 1; j < n; j++)
//                {
//                    if(arr[j] == 0)
//                        sum += -1;
//                    else
//                        sum += 1;
//
//                    if (sum == 0 && maxsize < j - i + 1)
//                    {
//                        maxsize = j - i + 1;
//                        startindex = i;
//                    }
//                }
//            }
//            endindex = startindex+maxsize-1;
////            if (maxsize == -1)
////                System.out.println("No such subarray");
////            else
////                System.out.println(startindex+" to "+endindex);
//
//            return maxsize;
//        }

        /* Driver program to others.test the above functions */
        public static void main(String[] args)
        {
            Solution sub;
            sub = new Solution();

            //11010111
            int arr[] = {1, 1, 0, 1, 0, 1, 1, 1};
            int size = arr.length;

            System.out.println(sub.maxLen(arr, size));
        }

}
