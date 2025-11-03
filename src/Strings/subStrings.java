package Strings;

public class subStrings {
    public static void main(String[] args) {
        String str = "alaf baig";
        String sub = str.substring(1,6);
        System.out.println(sub);

        //print all substrings
        String gtr = "alaf";
      for(int i=0;i<gtr.length();i++){
          for(int j = i+1;j<=gtr.length();j++){
              System.out.println(gtr.substring(i,j));
          }
      }

    }
}
