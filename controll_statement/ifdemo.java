package controll_statement;

import java.util.Scanner;

public class ifdemo {

    public static void numfinder(){
         Scanner info = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = info.nextInt();

        if(num>0){
            System.out.println("It is Positive");
        }else{
            if(num==0){
                System.out.println("It is neutral");
            }else{
                System.out.println("It is negative");
            }
        }
    }
    public static void main(String[] args) {
        numfinder();
    }
}
