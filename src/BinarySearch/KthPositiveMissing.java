package BinarySearch;

public class KthPositiveMissing {
    public static void main(String[] args) {
        int [] arr = {1,2,5,6,7,};
        int n = arr.length;
        int low = 0;
        int hig = n-1;
        int k = 1;
        while(low<=hig){
            int mid = low+(hig-low)/2;
            int correct = mid+1;
            int missing = arr[mid] - correct;
            if(missing >=k) hig = mid-1; // go left
            else low = mid+1; // go right
        }
        System.out.println("Kth positive element is  "+(low+k));
    }
}
