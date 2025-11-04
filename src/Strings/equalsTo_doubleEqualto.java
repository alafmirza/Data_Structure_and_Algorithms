package Strings;

public class equalsTo_doubleEqualto {
    public static void main(String[] args) {
        String str = "alaf";
        String str1 = "alaf";
        String gtr = new String("alaf");

        //compare by address
        System.out.println(str==gtr);
        System.out.println(str==str1);

        //compare by value
        System.out.println(str.equals(gtr));
    }

}
