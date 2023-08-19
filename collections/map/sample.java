package collections.map;

import java.util.HashMap;
import java.util.Map;

public class sample {
    public static void main(String[] args) {
        
        HashMap<Integer,String> alpha = new HashMap<>();

        HashMap<Integer,String> beta = new HashMap<>();

        alpha.put(1, "salem");
        alpha.put(2, "coimbatore");
        alpha.put(3, "chennai");

        alpha.putIfAbsent(4, "Trichy");

        for(Map.Entry a : alpha.entrySet()){
            System.out.println(a.getKey() + " " + a.getValue());
        }
        
        alpha.put(5, "Erode");

        beta.putAll(alpha);

        System.out.println();

        for(Map.Entry b : beta.entrySet()){
            System.out.println(b.getKey() + " " + b.getValue());
        }



    }
    
}
