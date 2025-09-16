package Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int [] arr = {1,8,6,19,22,11,0};
        int n = arr.length;
        int d =3;
        d = d%n;        // neglect unuseful reverse
        reverse(0,d-1,arr);   // reverse first 3 element
        reverse(d,n-1,arr);    // reverse  elements  after 3
        reverse(0,n-1,arr);  // reverse all elements

        // print array
        for (int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }

    }
    public static void reverse(int a,int b,int[] arr){
        int i = a; int j = b;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
