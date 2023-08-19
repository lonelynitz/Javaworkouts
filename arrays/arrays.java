package arrays;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        
        int sum =0;
        Scanner info = new Scanner(System.in);
        System.out.println("Enter the storing capacity of the array");
        int a = info.nextInt();

        int[] arr = new int[a];

        System.out.println("Enter how many numbers you have to print");

        for(int i=0;i<arr.length;i++){
            arr[i] = info.nextInt();
        }
        for(int j=0;j<arr.length;j++){
               // System.out.println(arr[j]);

                sum += arr[j];
            }

            System.out.println("Sum of the arrays : " + sum);
    }
}
