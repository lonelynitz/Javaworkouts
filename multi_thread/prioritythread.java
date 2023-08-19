package multi_thread;

public class prioritythread extends Thread {
     
    prioritythread(String a){
        super(a);
    }

    public void run() {
        System.out.println(Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {

        prioritythread p1 = new prioritythread("a");
        prioritythread p2 = new prioritythread("b");
        prioritythread p3 = new prioritythread("c");

        System.out.println(p1.getPriority() + " Before setting priority");
        System.out.println(p1.getPriority() + " Before setting priority");
        System.out.println(p3.getPriority() + " Before setting priority");

        p1.setPriority(9);
        p2.setPriority(6);
        p3.setPriority(3);

        System.out.println(p1.getPriority() + " After setting priority");
        System.out.println(p1.getPriority() + " After setting priority");
        System.out.println(p3.getPriority() + " After setting priority");

        System.out.println(Thread.currentThread().getName());

        Thread.currentThread().setName("Lonelynitzz");
    }
}
