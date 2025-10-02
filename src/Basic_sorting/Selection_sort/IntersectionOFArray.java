package Basic_sorting.Selection_sort;
//common elements in array

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOFArray {

    public static void main(String[] args) {
        int[] arr = {3,1,2,1,6,8,9};
        int[] brr = {1,3,7,1,4,6};
        int n = arr.length;
        int m = brr.length;
        Arrays.sort(arr);
        Arrays.sort(brr);
        ArrayList<Integer> list = new ArrayList<>();
        int i=0; int j=0;
        while(i<n && j<m){
            if(arr[i] == brr[j]){
                list.add(arr[i]);
                i++;
                j++;
            }
            else if(arr[i] < brr[j]) i++;
            else if (arr[i] > brr[j]) j++;
        }
        System.out.println(list);
    }
}
