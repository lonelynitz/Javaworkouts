package exceptional_handling;

import java.util.Scanner;

public class userdefinedexceptional {
    public static void main(String[] args) throws lonelynitzzexception{
        try{
            Scanner info = new Scanner(System.in);
            System.out.println("Enter the number :");
            int num = info.nextInt();
            if(num >20 && num<25){
                System.out.println("You have qualified");
            }else{
                throw new lonelynitzzexception("You are not qualified");
            }
        }catch(Exception e){
            System.out.println(e);
        }
        }
}
