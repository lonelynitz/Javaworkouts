package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;


public class arraylistdmo {
    public static void main(String[] args) {

        ArrayList<String> alpha = new ArrayList<String>();
        alpha.add("Harish");
        alpha.add("Akshiya");
        alpha.add("Kumar");

        System.out.println(alpha.get(1));
        System.out.println();
        alpha.set(0, "Anu");

        Collections.sort(alpha);

        // Printing in reverse order:
        ListIterator beta = alpha.listIterator(alpha.size());
        while(beta.hasPrevious()){
            System.out.println(beta.previous());
        }

        /*Iterator itr=alpha.iterator();  
        while(itr.hasNext()){
            System.out.println(itr.next());
        }*/

    }
}
