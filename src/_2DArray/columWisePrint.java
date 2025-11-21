package _2DArray;

public class columWisePrint {
    public static void main(String[] args) {
        int[][] arr = {{2,15,16,44},{12,44,51,198},{56,19,33,7}};
     for(int j=0;j<4;j++){
         for(int i=0;i<arr.length;i++){
             System.out.print(" "+arr[i][j]);
         }
         System.out.println();
     }
    }
}
