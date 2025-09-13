package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

// approach 1 by using flag

        int[] arr = {11,31,5,2,7,12,55};

        System.out.println("Enter element");
        int target =sc.nextInt();

        boolean found = false;

        int i;
        for (i=0; i<arr.length;i++){
            if(arr[i]==target){
                found = true;
                break;
            }

        }
        if(found){
            System.out.println("element present at index "+i);
        }else {
            System.out.println("element not present");
        }

    // approach 2 by using single variable

        int found1 = -1;

        int j;
        for (j=0; j<arr.length;j++){
            if(arr[j]==target){
                found1 = j;
                break;
            }

        }
        if(found1!=-1){
            System.out.println("element present at index "+found1);
        }else {
            System.out.println("element not present");
        }

    }
}