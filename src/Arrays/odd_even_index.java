package Arrays;

public class odd_even_index {
    public static void main(String[] args) {

        // Que :- multiply by 2 in odd index and add 10 in even index of array

        int[] arr = {1,2,3,4,5,6,7};
        int i;
        for (i=0;i<arr.length;i++){
            if(i%2!=0){

              arr[i] *= 2;

            }
            if(i%2==0){
                arr[i] += 10;
            }

            System.out.println(arr[i]);
        }






    }
}
