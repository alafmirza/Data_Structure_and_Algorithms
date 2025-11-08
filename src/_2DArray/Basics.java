package _2DArray;

public class Basics {
    public static void main(String[] args) {
          //Type 1
         //  int[][] arr = new int[3][4];
        //Type 2
        int[][] arr = {{2,3,4},{6,7,8},{5,2,1}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }

    }
}
