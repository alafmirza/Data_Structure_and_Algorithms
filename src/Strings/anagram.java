package Strings;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String s1 = "alaf";
        String s2 = "fala";
       boolean flag = true;
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        if(arr1.length!=arr2.length){
            System.out.println("This is anagram");
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                flag = false;
            }
        }
        if(flag) System.out.println("anagram");
        if(!flag) System.out.println("not anagram");


    }
}
