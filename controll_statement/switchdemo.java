package controll_statement;

import java.util.Scanner;

public class switchdemo {
    public static void main(String[] args) {
        
        Scanner info = new Scanner(System.in);
        System.out.println("Enter the Char to check vowel or consonant");
        char ch = info.next().charAt(0);

        switch(ch){
            case 'a':
            System.out.println("It is vowel");
            break;
            case 'e':
            System.out.println("It is vowel");
            break;
            case 'i':
            System.out.println("It is vowel");
            break;
            case 'o':
            System.out.println("It is vowel");
            break;
            case 'u':
            System.out.println("It is vowel");
            break;
            default :
            System.out.println("It is Consonant");
            break;
        }
    }
}
