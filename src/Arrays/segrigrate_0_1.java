package Arrays;

public class segrigrate_0_1 {
    public static void main(String[] args) {
        //method 1
        int[] arr = {1,0,1,0,0,1,1,0,1};
        int zeros = 0;
        int ones = 0;
        for (  int e  : arr  ){
            if(e==0) zeros++;
            if(e==1) ones++;
        }
        for(int i=0;i<zeros;i++){
            arr[i] =0;
        }
        for(int i=zeros;i<arr.length;i++){
            arr[i] =1;
        }
        for (int e : arr){
            System.out.print(" "+e);
        }

        //next line
        System.out.println();

        //method 2
        int n = arr.length;
        int i = 0 ; int j = n-1;
        while(i<j){
            if(arr[i]==0) i++;
           else if(arr[j]==1) j--;
          else if (arr[i]==1 && arr[j]==0){
              arr[i] = 0;
              arr[j] = 1;
              i++;
              j--;
            }
        }
        for (int e: arr){
            System.out.print(" "+e);
        }


    }
}
