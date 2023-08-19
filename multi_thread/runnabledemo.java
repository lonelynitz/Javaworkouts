package multi_thread;

import java.util.Scanner;

public class runnabledemo implements Runnable{

    public void run(){
        Scanner info = new Scanner(System.in);
        System.out.println("Enter the Name");
        String name = info.nextLine();

        System.out.println("Welcome : " + name );
    }
    
    public static void main(String[] args) {
        
        runnabledemo info = new runnabledemo();
        Thread alpha = new Thread(info);

        alpha.start();
    }
}
