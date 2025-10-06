package BinarySearch;

public class Binary_search {
    // Time complexity = log n
    public static void main(String[] args) {
        int [] arr = {-6,4,5,12,16,28,55,74,90,104};
        int n = arr.length;
        int low = 0;
        int hig = n-1;
        int target = 28;
        boolean flag = false;
        while(low<=hig){
            int mid = (low+hig)/2;
            if(arr[mid] > target){
                hig = mid-1;
            }
         else if(arr[mid] < target){
             low = mid+1;
            }
         else if(arr[mid] == target){
                System.out.println("Element present at index of "+mid);
                break;

            }

        }
    }
}


