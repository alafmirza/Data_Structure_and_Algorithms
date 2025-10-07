package BinarySearch;

public class PeakEle_MountainArray {
    public static void main(String[] args) {
        int [] arr = {2,4,9,16,33,12,5,3,-4,-33,-96};
        int n = arr.length;
        int low = 1;
        int hig = n-2;
        while(low<=hig){
            int mid = (low+hig)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                System.out.println("element found at index "+mid+"  and element is  "+arr[mid]);
                break;
            }
            else  if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]) low = mid+1;
            else  if(arr[mid] < arr[mid-1] && arr[mid] > arr[mid+1]) hig = mid-1;
        }
    }
}
