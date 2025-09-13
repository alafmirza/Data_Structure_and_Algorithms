package Arrays;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Targer element");
       int  target =sc.nextInt();
        int[] arr = {3,2,4,8,9,11};
      boolean flag = false;
      int i,j;
        for (i=0;i<arr.length;i++){
            for (j=0;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    flag = true;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("elemet present");
        }else {
            System.out.println("element not present");
        }




    }
}
