package multi_thread;

class namethread1 extends Thread{

    namethread1(String a){
        super(a);
    }

    public void run(){
        System.out.println("Welcome you guys");
    }
    
}
public class namethread{
     public static void main(String[] args) {
        
        namethread1 t1 = new namethread1("Lonelynitzz");
        String namet1 = t1.getName();
        System.out.println(namet1);
        t1.start();
     }
}
