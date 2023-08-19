package multi_thread;

public class sample extends Thread{
   public void run(){
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
         sample info = new sample();
         info.start();
    }
}

