package BinarySearch;

public class SearchIn_rotateArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,10,1,2,3};
        int n = arr.length;
        int low = 0;
        int hig = n-1;
        int target = 2;
        while(low<=hig){
            int mid = (low+hig)/2;
            if(arr[mid]==target) {System.out.println("element at index "+mid); break;}
            //left side
            else if(arr[low] <= arr[mid]){
                if(arr[low]<=target && target < arr[mid]) hig = mid-1;
                else low = mid+1;
            }
            else if (arr[mid] <= arr[hig]) {
                if(arr[mid] < target && target <= arr[hig]) low = mid+1;
                else hig = mid-1;
            }
        }
    }
}
