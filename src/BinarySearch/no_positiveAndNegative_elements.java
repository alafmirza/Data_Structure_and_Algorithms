package BinarySearch;

public class no_positiveAndNegative_elements {
    public static void main(String[] args) {
        int[] arr = {-4,-3,-2,-1,0,0,0,1,2,3,4,5};
        int n = arr.length;
        int low=0;
        int hig=n-1;
        int negative=-1;
        int positive=-1;
        while(low<=hig) {
            int mid = (low + hig) / 2;
            if (arr[mid] >= 0) hig = mid-1;
            else if(arr[mid] <=0){
                negative=mid;
                low = mid+1;
            }
        }

        low=0;
        hig=n-1;

        while (low<=hig){
            int mid = (low + hig) / 2;
            if(arr[mid] <=0) low = mid+1;
            else if(arr[mid] >0){
                positive = mid;
                hig = mid-1;
            }
        }
        int positiveCount=n-positive;
        int negativeCount = negative+1;
       if(positiveCount>negativeCount) System.out.println("Max count positive integer   "+positiveCount);
       else System.out.println("Max count negative integer   "+negativeCount);

    }
}
