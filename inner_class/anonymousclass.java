package inner_class;

abstract class a{
   abstract void run();
}

public class anonymousclass {
    public static void main(String[] args) {
        
        a obj = new a() {

            @Override
            void run() {
                System.out.println("Welcome ");
            }
            
        };

        obj.run();
    }
}
