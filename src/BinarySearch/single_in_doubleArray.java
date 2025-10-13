package BinarySearch;

public class single_in_doubleArray {
    public static void main(String[] args) {

        int[] arr = {1,1,2,2,3,3,4,4,5,6,6}; // importer is 5
        int n = arr.length;
        int low = 0;
        int hig = n-1;

        if(n==1){
            System.out.println("single element is "+arr[0]);
        }
        if(arr[0]!=arr[1]) {
            System.out.println("single element is "+arr[0]);
        }
       if(arr[n-1]!=arr[n-2]){
            System.out.println("single element is "+arr[n-1]);
        }

        while (low<=hig){
            int mid = (low+hig)/2;

            if( arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
                System.out.println("single element is "+arr[mid]);
            }

            //occurrence
            int f = mid, s = mid;
            if(arr[mid]==arr[mid-1]) f = mid-1;
            else if(arr[mid]==arr[mid+1]) s = mid+1;

            //odd even count
           int leftCount = f-low;
           int rightCount = hig-s;

           //Binary Search
           if(leftCount%2==0) low = s+1;
           else if(rightCount%2==0) hig = f-1;

        }

    }
}
