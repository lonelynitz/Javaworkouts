package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linkedhashsetdemo {
     public static void main(String[] args) {
        
        LinkedHashSet<String> alpha = new LinkedHashSet<>();
        alpha.add("alpha");
        alpha.add(null);  // Allow null values in LinkedHashSet: only one time
        alpha.add("beta");
        alpha.add("gamma");
        

        for(String a : alpha){
            System.out.println(a);
        }

    }
}
