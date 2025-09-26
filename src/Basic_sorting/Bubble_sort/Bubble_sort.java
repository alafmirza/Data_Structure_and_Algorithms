package Basic_sorting.Bubble_sort;

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

        for(int i=0;i<n-1;i++) {
            for (int j = 0; j < n-1-i; j++) {  //count of lopp j
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        print(arr);
        System.out.println();
         // approach 2

        for(int i=0;i<n-1;i++) {
            boolean flag = true;
            for (int j = 0; j < n-1-i; j++) {  //
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag =false;
                }
                if(flag) break;
            }
        }
        print(arr);
        System.out.println();

        // optimised way



        for(int i=0;i<n-1;i++) {
            int swap = 0;
            for (int j = 0; j < n-1-i; j++) {  //
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;

                }
                if(swap==0) break;

            }
        }
                 print(arr);


    }
}