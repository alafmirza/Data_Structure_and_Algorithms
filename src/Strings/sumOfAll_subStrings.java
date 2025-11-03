package Strings;

public class sumOfAll_subStrings {
    public static void main(String[] args) {
        String str = "6759";
        int n = 0;
        for(int i = 0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String sub = str.substring(i,j);
              n = n + Integer.parseInt(sub);
            }
        }
        System.out.println(n);
    }
}
