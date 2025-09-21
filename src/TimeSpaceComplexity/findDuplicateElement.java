package TimeSpaceComplexity;

public class findDuplicateElement {
    public static void main(String[] args) {
        int [] arr = {1,2,4,3,5,4};
        //actual array {1,2,4,3,5}
        int n = arr.length;   // length of given array = 6

        //approach 1
//
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    System.out.println("duplicate element is "+arr[j]);
                    break;

                }
            }
        }           //in this code no of operation is high
        //approach 2
         boolean[] flag = new boolean[n];
          for (int i =0;i<n;i++){
              int e = arr[i];
              if(!flag[e]){
                  flag[e] = true;
              }else { // flag[e] == true duplicate found
                  System.out.println("duplicate value is "+e);
              }
          }
          // in this code we reduce operations usig extra space

        //approach 3
        int l = n-1; // length of actual array  = 5
        int sum1 = l*(l+1)/2;   //sum of actual array
        int sum2 = 0;
          for(int i=0;i<n;i++){
              sum2 += arr[i];
          }
         int duplicate = sum2 - sum1;
         System.out.println("duplicate  is "+duplicate);

         // it is an optimized way to find duplicate element

    }
}
