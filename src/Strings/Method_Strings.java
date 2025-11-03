package Strings;

public class Method_Strings {
    public static void main(String[] args) {
        String str = "Alaf Baig";
        String gtr = "Alaf Mirza";
        //charAt
        char ch = str.charAt(3);
        System.out.println(ch);

        //length
        int l = str.length();
        System.out.println(l);

        // loop in Strings
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
       // IndexOf
        int position = str.indexOf('a');
        System.out.println(position);

        //toUppercase
        String S =str.toUpperCase();
        System.out.println(S);

        //toLowercase
        String s = str.toLowerCase();
        System.out.println(s);

        //contains
        Boolean b = str.contains("Baig");
        System.out.println(b);

        //compare to Lexographically(Dictionary)
     int n =   str.compareTo(gtr);
        System.out.println(n);

        //concat
        String concat = str.concat(gtr);
        System.out.println(concat);

        System.out.println(str.startsWith("Ala"));
        System.out.println(str.endsWith("ig"));
    }

}
