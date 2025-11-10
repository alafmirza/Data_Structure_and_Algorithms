package _2DArray;

public class maxRowSum {
    public static void main(String[] args) {
        int[][] arr = {{2,15,16,44},{12,44,51,198},{56,19,33,7}};
         int sum =0;
         int max = -1;
         int row = -1;
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                 sum += arr[i][j];
            }
           if(sum>max){
               max = sum;
               sum =0;
               row =i;
           }
        }
        System.out.println("Maximum sum row is = "+row+" and sum is = "+max);

    }
}
