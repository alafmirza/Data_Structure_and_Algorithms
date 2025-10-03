package Basic_sorting.Selection_sort;

public class Kth_element {
    public static void main(String[] args) {
        int[] arr = {23,11,66,45,93,81,38};
        int n = arr.length;
        int k = 3;
        for(int i=0;i<k;i++){
            int min = Integer.MAX_VALUE;
            int mindex = -1;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min = arr[j];
                    mindex = j;
                }
            }
              int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;
        }
      for(int e : arr){
          System.out.print(" "+e);
      }


    }
}
