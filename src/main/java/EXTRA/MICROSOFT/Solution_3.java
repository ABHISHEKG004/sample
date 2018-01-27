package EXTRA.MICROSOFT;

/**
 * Created by abhishek.gupt on 25/01/18.
 */
public class Solution_3 {

//    static void print(int arr[], int si)
//    {
//
//    }

    static void uniqueSums(int n)
    {
        int po = 0;
        int[] arr = new int[n];
        arr[po] = n;

        while(true)
        {
            //print(arr, po+1);

            for (int i=0;i<=po;i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            int rv = 0;
            while (po >= 0 && arr[po] == 1)
            {
                rv = rv + arr[po];
                po--;
            }

            if(po<0)
                return;

            arr[po]--;
            rv++;

            while(rv > arr[po])
            {
                arr[po+1] = arr[po];
                rv = rv - arr[po];
                po++;
            }
            arr[po+1] = rv;
            po++;
        }
    }

    public static void main(String[] args) {
        uniqueSums(5);
    }
}
