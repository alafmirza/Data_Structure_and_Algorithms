package BinarySearch;

public class Floor_element {
    public static void main(String[] args) {
        int [] arr = {1,2,12,18,33,44,55};
        int n = arr.length;
        int target = 15;
        int low = 0;
        int hig = n-1;
        int index = -1;
        while (low<=hig){
            int mid = (low+hig)/2;
            if(arr[mid] > target) hig = mid -1;
            else if(arr[mid] <= target){
                index = mid;
                low = mid+1;
            }
        }
        System.out.println(index);

    }
}
