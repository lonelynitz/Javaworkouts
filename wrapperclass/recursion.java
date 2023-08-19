package wrapperclass;

public class recursion {
    
    public int fact(int n){
        if(n==1){
            return 1;
        }
       int a = n*fact(n-1);
       return a;
    }

    public static void main(String[] args) {
         recursion a = new recursion();
         System.out.println(a.fact(5));
    }
}
