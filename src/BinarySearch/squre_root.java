package BinarySearch;

public class squre_root {
    public static void main(String[] args) {
        int[] arr = {1,3,5,9,18,26};
        int target = 81;
        int n = arr.length;
       int low = 0;
       int hig = n-1;
       int index = -1;
       while (low<=hig){
           int mid = (low+hig)/2;
           if(arr[mid]*arr[mid] > target) hig = mid-1;
           else if(arr[mid]*arr[mid] < target) low = mid+1;
           else if(arr[mid]*arr[mid] == target) {
               System.out.println("sure root is  "+arr[mid]);
               break;
           }
       }
    }
}
