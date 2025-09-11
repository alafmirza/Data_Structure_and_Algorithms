package Arrays;

public class sumOFArray {
    public static void main(String[] args) {


        // sum of array

        int[] ar = {10,20,30,40,50};

        int sum =0;
        for (int i=0;i<ar.length;i++){

            sum += ar[i];
        }
        System.out.println("sum of array "+sum);

        //product of an array

        int product =1;
        for (int i=0;i<ar.length;i++){

            product *= ar[i];
        }
        System.out.println("product of array "+product);

    }
}
