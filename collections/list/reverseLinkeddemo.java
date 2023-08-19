package collections.list;

import java.util.Iterator;
import java.util.LinkedList;

public class reverseLinkeddemo {
    public static void main(String[] args) {
        
        LinkedList<String> alpha = new LinkedList<>();
        alpha.add("vasanth");
        alpha.add("mani");
        alpha.add("kumar");
        alpha.add("akshiya");

        Iterator beta = alpha.descendingIterator();
        while(beta.hasNext()){
            System.out.println(beta.next());
        }
    }
}
