package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AddOne {
    public static void main(String[] args) {
        //input array
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = Sc.nextInt();
        System.out.println("enter elements ");
        int[] arr = new int[n];;
        for (int i=0;i<n;i++){
            arr[i] = Sc.nextInt();
        }
        //create empty array list
        ArrayList<Integer>  list = new ArrayList<>();

        //condition
        int carry = 1;
        for(int i =n-1;i>=0;i--){
            if(arr[i]+carry <=9){
                 list.add(arr[i]++);
                 carry = 0;
            }
            else { // arr[i} + carry = 10
               list.add(0);
               carry=1;
        }
    }
        if(carry==1) list.add(carry);
        //reverse array list
        Collections.reverse(list);
        System.out.println(list);
}}
