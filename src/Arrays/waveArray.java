package Arrays;

public class waveArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7};
    int n = arr.length;
        for (int i=0;i<n;i+=2){
            if(i==n-1)  break;

            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for (int ele : arr){
            System.out.print(" "+ele);
        }
    }
}
