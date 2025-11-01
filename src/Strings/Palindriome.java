package Strings;

import java.util.Scanner;

public class Palindriome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sting:- ");
        String str = sc.nextLine();
        int i =0;
        int j =str.length()-1;
        boolean flag = true;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)) flag = false;
            i++;
            j--;
        }
        if(flag){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }

    }
}
