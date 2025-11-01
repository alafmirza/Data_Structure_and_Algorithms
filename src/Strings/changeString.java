package Strings;

public class changeString {
    public static void main(String[] args) {
        String str = "Hello";
        if(Character.isUpperCase(str.charAt(0))) {
           str = str.toUpperCase();
        }else {
            str = str.toLowerCase();
        }
        System.out.println(str);
    }
}
