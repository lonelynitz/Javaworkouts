package inner_class;

public class localinnerclass {
    private double percentage = 90;
    void display(){
        class mark{
            void list(){
                System.out.println(percentage);
            }
        }
         mark a = new mark();
         a.list();
    }

    public static void main(String[] args) {
        
        localinnerclass alone = new localinnerclass();
        alone.display();
    }
}
