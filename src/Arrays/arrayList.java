package Arrays;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        //define arraylist
        ArrayList<Integer> arr = new ArrayList<>();
        // add into Arraylist
        arr.add(24);
        arr.add(19);
        arr.add(33);
        arr.add(64);
        arr.add(36);
        arr.add(1,44);
        arr.addFirst(1);
        System.out.println(arr);

        // get element like a[2] value
        System.out.println( arr.get(2));

        // set element like  a[2] = 12;
         arr.set(2,12);

         //remove element
        arr.remove(4);


        //swap array list \
        int i =0 ;int j = arr.size()-1;
        while (i<j){
           int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;

        }
        //print single element in arralist
        for (int e : arr){
            System.out.print(" "+e);
        }


    }

}
