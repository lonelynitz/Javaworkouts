package arrays;

import java.util.Scanner;

public class multi_demdemo{

    public static void main(String[] args) {
        // i havnt initailzed a and b with values so it indicates arrayindexoutofbound
        
        Scanner info = new Scanner(System.in);
        System.out.println("Enter the rows");
        int a = info.nextInt();
        System.out.println("Enter the columns");
        int b = info.nextInt();
        int[][] arr = new int[a][b];

        for(int i=0;i<arr[a].length;i++){
            for(int j=0;j<arr[b].length;j++){
                int sum = arr[i][j] + arr[i][j] ;
                System.out.println(sum);
            }
            System.out.println();
        }
    }
}