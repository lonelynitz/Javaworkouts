package collections.set;

import java.util.HashSet;

public class hashsetdemo {
    public static void main(String[] args) {
        
        HashSet<String> alpha = new HashSet<>();
        alpha.add("alpha");
        alpha.add("beta");
        alpha.add("gamma");
        alpha.add("alpha");  // doesnt allow duplicate value:

        for(String a : alpha){
            System.out.println(a);
        }

    }
}
