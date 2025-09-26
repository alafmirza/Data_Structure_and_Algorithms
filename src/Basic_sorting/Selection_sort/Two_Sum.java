package Basic_sorting.Selection_sort;


import java.util.Arrays;

public class Two_Sum {
public static void print (int[] arr){
    for(int e : arr){
        System.out.print(" "+e);
    }
}
    public static void main(String[] args) {
        int [] arr = {3,6,1,19,8,9};
        int target = 7;
        int n = arr.length;
        // buit in sort
        Arrays.sort(arr);

        //print array
        print(arr);
        System.out.println();

        boolean flag = false;
        int i = 0; int j = n-1;
        while(i<j){
            if(arr[i]+arr[j]==target) {
                flag = true;
                break;
            }
            else if (arr[i]+arr[j]>target) j--;
            else if (arr[i]+arr[j]<target) i++;
        }
        if(flag){
            System.out.println("sum is present at index of "+i+" "+j);
        }


    }
}
