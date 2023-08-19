package exceptional_handling;

public class trycatchdemo {
    public static void main(String[] args) {
        // multi catch
        try{
            int a=10;
            int c = a/0;
            System.out.println(c);
            int[] arr = new int[6];
            System.out.println(arr[4]);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e); 
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
