public class Arithematic {
    public static void main(String[] args) {
        // + - * / 
       /*  int a , b , c;
        a=12;
        b=32;

        a += 3;
        a++;

        c = ++a ; 
        int d = a++ ;
        int e = a;*/

        int a = 3 , b =4;
        int c = a+b + a++ + b++ + ++a + ++b;
        System.out.println(c);

        
    }
}