package Arrays;

public class largest_Element {
    public static void main(String[] args) {

        int[] ar = {6, 11, 35, 44, 5,1,41};

        int max = ar[0];
        for(int i=0;i<ar.length;i++){

            if(ar[i] > max){

                max = ar[i];
            }
        }
        System.out.println("Largest Element "+max);

    }
}