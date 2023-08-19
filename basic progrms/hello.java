import java.util.Scanner;

public class hello{
    public static void main(String[] args) {
        try (Scanner info = new Scanner(System.in)) 
        {
            System.out.println("Enter the Name");
            String name = info.next();
            System.out.println("Hello welcome " + name);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}