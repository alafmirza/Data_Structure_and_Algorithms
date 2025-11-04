package Strings;

public class stringBuilder {
    public static void main(String[] args) {

        //initialization
        StringBuilder s = new StringBuilder(100);


        //capacity of String Builder
        System.out.println("capisity "+s.capacity());

        //methods
        s.append("alaf baig");
        System.out.println(s);

        //length of String builder
        System.out.println(" length "+s.length());

         //change set
        s.setCharAt(8,'a');
        System.out.println(s);

        //delete character
        s.deleteCharAt(8);
        System.out.println(s);

        //insert character
        s.insert(0,'a');
        System.out.println(s);

        //reverse the string
        s.reverse();
        System.out.println(s);

        //method 2  reverse string by algorithm

        StringBuilder str = new StringBuilder(10);
        str.append("alaf mirza");
     int i = 0;
     int j = str.length()-1;
     while(i<=j){
         char x = str.charAt(i);
         char y = str.charAt(j);
         str.setCharAt(i,y);
         str.setCharAt(j,x);
         i++;
         j--;
     }
        System.out.println(str);


    }
}
