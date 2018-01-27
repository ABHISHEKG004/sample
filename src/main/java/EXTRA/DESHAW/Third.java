package EXTRA.DESHAW;

/**
 * Created by abhishek.gupt on 15/12/17.
 */
public class Third {

    static boolean checkValid(int cn[]){
        if(cn[0]>0 && cn[1]>0 && cn[2]>0){
            return true;
        }
        return false;
    }


    static void count_substrings(String[] abc) {
        int  k = abc.length;




        for(int i = 0;i<k;i++){

            int cn[]  = new int[3];
            cn[0]=0;
            cn[1]=0;
            cn[2]=0;

            long ans = 0;
            String ch = abc[i];
            int len = ch.length();

            int i1=0;
            int i2=0;
            int fg=0;
            int prev  =0;
            while(i1<len && i2<len){

                int ind = ch.charAt(i2)-97;
                if(fg==0)
                cn[ind]++;

                if(checkValid(cn)){
                    //System.out.println("ghusa");
                    ans = ans + (long)(len-i2);
                    int ind1 = ch.charAt(i1)-97;
                    fg=1;
                    i1++;
                    cn[ind1]--;
                }else{
                    i2++;
                    fg=0;
                }

            }
            System.out.println(ans);

        }

    }
    public static void main(String[] args) {
        String[] yo = new String[1];
        yo[0] = "baaabaacaab";
        //yo[0] = "babacab";
        //yo[0] = "bacab";
        //yo[1] = "abc";
        //yo[2] = "cacacacab";
        //yo[3] = "abcca";
        count_substrings(yo);

    }
}
