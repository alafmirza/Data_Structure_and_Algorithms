package Arrays;

public class passing_array {
    public static void main(String[] args) {
        int[] x = {10,20,30,40,50};
        x[0] = 100;
        System.out.println(x[0]);

        change(x);
        System.out.println(x[0]);

    }
    public static void change(int[] x){
        x[0]= 200;
    }
}
