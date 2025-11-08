package _2DArray;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows");
        int rows = sc.nextInt();
        System.out.println("enter columns");
        int colums = sc.nextInt();
        int[][] arr = new int[rows][colums];

        System.out.println("Enter Elements");
        for(int i=0;i<rows;i++){
            for(int j=0;j<colums;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<colums;j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
    }
}
