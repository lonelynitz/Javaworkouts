package collections.list;

import java.util.LinkedList;

public class Linkedlistdemo {
    public static void main(String[] args) {
        
        LinkedList<Integer> num = new LinkedList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);


        for(Integer a : num){
            System.out.println(a);
        }

        /*Iterator beta = num.iterator();
        while(beta.hasNext()){
            System.out.println(beta.next());
        }*/
    }
}
