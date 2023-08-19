package loops;

public class fortast1 {
    public static void main(String[] args) {
        
        int a =5;
        outer:
        for(int i=1;i<=a;i++){
            inner:
            for(int j=1;j<=i;j++){
                if(j==2 && j==4)
                    continue outer;
                    System.out.print("*");
            }

            System.out.println();
        }
    }
}
