package _2DArray;

public class ForEachPrinting {
    public static void main(String[] args) {
        int [][] arr = {{2,15,16,44},{12,44,51,198},{56,19,33,7}};
        for(int[] array : arr){
            for(int e :array){
                System.out.print(" "+e);
            }
            System.out.println();
        }
    }
}
