package Basic_sorting;

public class Bubble_sort {
    public static void print(int[] arr) {
        for (int e : arr) {
            System.out.print(" " + e);
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 7, 6, 5, 4, 1, 2, 10};
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
    }
}