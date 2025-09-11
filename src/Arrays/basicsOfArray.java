package Arrays;

import java.util.Scanner;

public class basicsOfArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      // Initialize array

        int[] array = {10,20,30,40,50};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);


        // initialize empty array

        int[] arr = new int[5];
          arr[0] = 10;
          arr[1] = 20;
          arr[2] = 30;
          arr[3] = 40;
          arr[4] = 50;
        System.out.println(arr[1]);

        //input output of an array

        System.out.println("Enter Array Size");    //input array size
        int n = sc.nextInt();

        int[] a = new int[n];    //create arrayy

        System.out.println("Enter elements");     //input array
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }

        System.out.println("array Elements");     //output array
        for(int i=0;i<a.length;i++){
            System.out.print(" "+a[i]);
        }


    }

}
//basics of an array