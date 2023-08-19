public class comparison {
    public static void main(String[] args) {
        
        // AND -> && : both the condition should satisfy
        //  OR -> || : either one condition is enough
        int  a =50;

        if(a>45 &&  a<60 ){
            System.out.println("Welcome");
        }

        if(a<60 || a>20){
            System.out.println("Welcome guys");
        }
    }
}
