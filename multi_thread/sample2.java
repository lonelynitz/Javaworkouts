package multi_thread;

class sample implements Runnable{
     public void run(){
        System.out.println("Welcome guys");
     }    
}
public class sample2 extends sample{
 public static void main(String[] args) {
    sample info = new sample();
    Thread alpha = new Thread(info);
    alpha.start();
 }
}
