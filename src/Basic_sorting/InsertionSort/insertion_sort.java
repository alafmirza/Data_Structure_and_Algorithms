package Basic_sorting.InsertionSort;

public class insertion_sort {
    public static void main(String[] args) {
         int [] arr = {33,1,4,31,44,2,9,6,7};
         int n = arr.length;
         for(int i=1;i<n;i++){
             int j =i;
             while(j>0 && arr[j]<arr[j-1]){
                  int temp = arr[j];
                  arr[j] = arr[j-1];
                  arr[j-1] = temp;
                  j--;
             }
         }
         for(int e : arr){
             System.out.print(" "+e);
         }
    }
}
