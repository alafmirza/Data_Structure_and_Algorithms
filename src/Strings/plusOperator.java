package Strings;

public class plusOperator {
    public static void main(String[] args) {
        String str = "Alaf";

        //add another string
        str = str + "Baig";
        System.out.println(str);

        //add integer
       str = str + 10;
        System.out.println(str);

        //add double integer
        str = str + 10+10;
        System.out.println(str);

        //add double integer before
        str = 10+10+ str ;
        System.out.println(str);

        //add character
        System.out.println('A'+10+"hello");

        //convert into string
        int n = 1230;
        //1 method
        String s = "";
         s+=n;
        System.out.println(s);

        //2 method
        int x = 444;
        String s1= Integer.toString(x);
        System.out.println(s1);

        //convert into integer

        String str1 = "1234";
        int num = Integer.parseInt(str1);
        System.out.println(num);
    }

}
