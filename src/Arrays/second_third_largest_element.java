package Arrays;

public class second_third_largest_element {
    public static void main(String[] args) {
        int[] arr = {12,45,33,9,18,50};
        int max = arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                  max = arr[i];   //expeted answer 50
            }
        }


            int max2= arr[0];
        for (int j=0;j<arr.length;j++){
            if(arr[j]>max2 && arr[j]<max){
                max2 = arr[j];     // expeted answer 45
            }
        }


        int max3= arr[0];
        for (int k=0;k<arr.length;k++){
            if(arr[k]>max3 && arr[k]<max && arr[k]<max2){
                max3 = arr[k];     // expeted answer 33
            }
        }




        System.out.println("1 largest= "+max);
        System.out.println("2 largest= "+max2);
        System.out.println("3 largest= "+max3);
    }
}
