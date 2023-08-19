package collections.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmapdemo {
    public static void main(String[] args) {
        
        HashMap<Integer,String> alpha = new HashMap<>();
        alpha.put(1, "Salem");
        alpha.put(2, "Covai");
        alpha.put(3, "Chennai");

        // accending order : 
        //alpha.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        // reverse Oder:
        //alpha.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);


        for(Map.Entry a : alpha.entrySet()){
            System.out.println(a.getKey() + " " + a.getValue());
        }
        /*Iterator beta = alpha.entrySet().iterator();
        while(beta.hasNext()){
            System.out.println(beta.next());
        }*/

    }
}
