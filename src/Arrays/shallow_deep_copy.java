package Arrays;

import java.util.Arrays;

public class shallow_deep_copy {
    public static void main(String[] args) {
        int[] x = {10,20,30,40,50};

        //shallow copy

        int[] arr = x;
        arr[0]=100;

        //deep copy
        int[] y = Arrays.copyOf(x,x.length);

        y[0] = 500;


        System.out.println(arr[0]);
        System.out.println(y[0]);


    }


}
