package EXTRA.MICROSOFT;

/**
 * Created by abhishek.gupt on 25/01/18.
 */
public class Solution_2 {


    static int[][] modifyMatrix(int[][] arr) {

        int row,col;
        row = arr.length;
        col = arr[0].length;

        int[] markRow = new int[row];
        int[] markCol = new int[col];
        //int[][] res = new int[row][col];

        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                if(arr[i][j]==1){
                    markRow[i]=1;
                    markCol[j]=1;
                }
            }
        }

        for(int i=0;i<row;i++){
            if(markRow[i]==1){
                //System.out.println("row " + i);
                for(int j = 0;j<col;j++){
                    arr[i][j]=1;
                }
            }
        }


        for(int i=0;i<col;i++){
            if(markCol[i]==1){
                //System.out.println("col " + i);
                for(int j = 0;j<row;j++){
                    arr[j][i]=1;
                }
            }
        }

//        for(int i = 0;i<2;i++){
//            for(int j =0;j<3;j++){
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }

        return arr;

    }

    public static void main(String[] args) {

        int[][]  ar = new int[2][3];
        ar[0][0] = 0;
        ar[0][1] = 0;
        ar[0][2] = 0;

        ar[1][0] = 0;
        ar[1][1] = 1;
        ar[1][2] = 0;

        int[][]  res  = modifyMatrix(ar);

        //System.out.println("sol");
        for(int i = 0;i<2;i++){
            for(int j =0;j<3;j++){
                System.out.print(res[i][j]);
            }
            System.out.println();
        }
    }
}
