package BinarySearch;

public class Fist_Last_occur {
    public static void main(String[] args) {

        // First Occurrence

        int [] arr = {1,1,2,4,6,7,7,7,16,24,56,99};
        int n = arr.length;
        int low = 0;
        int hig = n-1;
        int target = 7;
        int index = -1;

        while(low <= hig){
            int mid = (low+hig)/2;
            if(arr[mid] > target){
                hig = mid-1;
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
            else if(arr[mid] == target){
                hig = mid-1;
                index = mid;
            }
        }
        System.out.println("first occurrence present at index "+index);

        // Last Occurrence

        int low1 = 0;
        int hig1= n-1;
        int target1 = 7;
        int index1 = -1;
        boolean flag = false;

        while(low1 <= hig1){
            int mid = (low1+hig1)/2;
            if(arr[mid] > target1){
                hig1 = mid-1;
            }
            else if(arr[mid]<target1){
                low1 = mid+1;
            }
            else if(arr[mid] == target1){
                low1 = mid+1;
                index1 = mid;
            }
        }

        System.out.println("Last Occurrence at index "+index1);

    }
}
