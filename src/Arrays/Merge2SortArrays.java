package Arrays;

public class Merge2SortArrays {
    public static void main(String[] args) {
        int[] a = {1,3,5,7,9};
        int[] b = {2,4,6,8,10,12,14,16};
        int[] c = new int[a.length+b.length]; // { , , , , , , , }
        merge(a,b,c);
        for (int e: c){
            System.out.print(" "+e);
        }
    }
     public static void merge(int[] a,int[] b,int[] c){

        int i = 0;
        int j = 0;
        int k = 0;
        while (i<a.length && j<b.length){
            //using ternary operator
//            c[k++] = (a[i] < b[j]) ? a[i++]:b[j++];

            if(a[i] < b[j]){
                c[k++] = a[i++];

            }else { // a[i] > b[j]
                c[k++] = b[j++];
            }
        }
            while(i<a.length){
               c[k++] = a[i++];
            }
            while(j<b.length){
                c[k++] = b[j++];
            }

     }



}
