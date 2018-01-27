package EXTRA.Algorythma;

/**
 * Created by abhishek.gupt on 17/12/17.
 */
import java.util.*;


class Bucket {
        public ArrayList<Integer> numbers = new ArrayList<Integer>();
        public ArrayList<Integer> numbers_sorted =new ArrayList<Integer>();
        Bucket() {
            numbers_sorted.clear();
            numbers.clear();
        }
        int query(int pos) {
            return numbers.get(pos);
        }
        void build() {
            //numbers_sorted = Object.clone(numbers);
            Collections.sort(numbers_sorted);
            }
        };

public class Solution {


    public static <T> int upperBound(ArrayList<T> a, int first, int last, T key) {
        int it;
        int count = last - first, step;

        while (count > 0) {
            it = first;
            step = count / 2;
            it += step;
            int _cmp = ((Comparable<T>) key).compareTo(a.get(it));
            // if (!(val<*it))
            if (!(_cmp < 0)) {
                first = ++it;
                count -= step + 1;
            } else
                count = step;
        }
        return first;
    }





    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */


        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] ar = new int[n];
        for(int i= 0;i<n;i++){
            ar[i] = obj.nextInt();
        }



        ArrayList<Integer> ret= new  ArrayList<Integer>();
        ArrayList<Bucket> buckets = new ArrayList<Bucket>();
        int bucket_size = 200;
        int sz = (int)(n / bucket_size) + 5;
        //buckets.resize(int(n / bucket_size) + 5);

        for(int i=0;i<sz+1;i++){
            buckets.add(new Bucket());
        }
        for (int i = 0; i < n; i++) {
            buckets.get(i / bucket_size).numbers.add(ar[i]);
            buckets.get(i / bucket_size).numbers_sorted.add(ar[i]);
        }

        for (int i = 0; i <= n / bucket_size; i++) {
            buckets.get(i).build();
        }





        int q = obj.nextInt();

        while(q>0){
            q--;
            int l = obj.nextInt();
            int r = obj.nextInt();
            int x = obj.nextInt();

            //System.out.println(l + " " + r + " " + x);
//            int cn=0;
//            for(int i = l;i<=r;i++){
//                if(ar[i]==x){
//                    cn++;
//                }
//            }


            int a, b, c;
            a = l;
            b = r;
            c = x;
            a--;
            b--;

            int tmp = 0;
            while (a < b && a % bucket_size != 0) {
                //System.out.println(a + " " + b + " " + tmp);
                if(buckets.get(a / bucket_size).query(a % bucket_size) == c){
                    //System.out.println("tru");
                    tmp = tmp +1;
                };
                a++;
            }
            while (a < b && b % bucket_size != 0) {
                //System.out.println(a + " " + b + " " + tmp);
                if(buckets.get(b / bucket_size).query(b % bucket_size) == c){
                    //System.out.println("tru 2nd");
                    tmp = tmp +1;
                }
                b--;
            }
            while (a < b) {
                //System.out.println(a + " " + b + " " + tmp);
                int pos = a / bucket_size;
                tmp += upperBound(buckets.get(pos).numbers_sorted, 0, buckets.get(pos).numbers_sorted.size(), c) - 0;

                //System.out.println("tru " + tmp);
                a += bucket_size;
            }
            //System.out.println(a + " " + b + " " + tmp);

            if(buckets.get(a / bucket_size).query(a % bucket_size ) == c){
                //System.out.println("tru out");
                tmp = tmp  +1;
            }
            //ret.add(tmp);


            System.out.println(tmp);

        }
    }
}