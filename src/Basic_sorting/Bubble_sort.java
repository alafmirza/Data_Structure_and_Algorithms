package Basic_sorting;

public class Bubble_sort {
    public static void print(int[] arr) {
        for (int e : arr) {
            System.out.print(" " + e);
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 7, 6, 5, 4, 1, 18,2, 10};
        int n = arr.length;

        //bubble sort approach 1

//        for(int i=0;i<n-1;i++) {
//            for (int j = 0; j < n-1-i; j++) {  //count of lopp j
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
         // approach 2

        for(int i=0;i<n-1;i++) {
            boolean flag = true;
            for(int j=0;j<n-1;j++){                // check array is sorted or not
                if(arr[j] > arr[j+1]){
                    flag = false;
                    break;                          //if not sorted  move down code
                }
                if (flag) break;                     // if sort break 1 loop
            }
            for (int j = 0; j < n-1-i; j++) {  //
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        print(arr);




    }
}