package Strings;

import java.util.Arrays;

public class commonCharacter {
    public static void main(String[] args) {

        //method 1

        String s = "alafmirzzzzz";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        int n = s.length();
        int freqent = -1;
        char ans = s.charAt(0);
        //aaaffffilmz
        int i = 0;
        int j = 0;
        while(j<n) {
            if (ch[i] == ch[j]) {
                j++;
            } else {
                int max = j - i;
                if (max > freqent) {
                    freqent = max;
                    ans = ch[i];
                }
                i = j;
            }
            int max = j - i;
            if (max > freqent) {
                freqent = max;
                ans = ch[i];
            }
        }

        System.out.println("Common charecter is = "+ans);
        System.out.println("Number of repetation is = "+freqent);

        //method 2

        int[] freq = new int[26];
        for(int l=0;l<s.length();l++){
            int ch1 = s.charAt(l);
            int index = ch1-97;
            freq[index]++;
        }

        int count = -1;
        char answer = s.charAt(0);
        for(int k=0;k< freq.length;k++){
            if(freq[k]>count) {
                count = freq[k];
               answer = (char)(k+97);
            }
        }

        System.out.println("Common character is = "+answer);
        System.out.println("The repetations is = "+count);



    }
}
