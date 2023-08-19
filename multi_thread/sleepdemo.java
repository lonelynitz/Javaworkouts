package multi_thread;

public class sleepdemo extends Thread{
    public void run(){
        int num =5;

        for(int i=1;i<=num;i++){

            try{
                Thread.sleep(2000);
                System.out.print(i);
            }catch(Exception e){
                System.out.print(e);
            }

            for(int j=1;j<=i;j++){
                try{
                Thread.sleep(2000);
                System.out.print(j);
            }catch(Exception e){
                System.out.println(e);
            }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        sleepdemo info = new sleepdemo();
        info.start();
    }
}
