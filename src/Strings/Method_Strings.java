package Strings;

public class Method_Strings {
    public static void main(String[] args) {
        String str = "Alaf Baig and i am a full stack developer";
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


    }
}
