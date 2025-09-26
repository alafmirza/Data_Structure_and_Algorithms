package Basic_sorting.Selection_sort;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = {6,-1,3,7,18,9,4};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min = Integer.MAX_VALUE;  // minimum vbalue
            int mindx = -1;   // minimum value index
            for (int j=i;j<n;j++){
                if(arr[j] < min){
                    min=arr[j];
                    mindx =j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }
        for(int e : arr){
            System.out.print(" "+e);
        }
    }

}
// time complexity O(n2)