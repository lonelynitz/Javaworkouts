package collections.list;

import java.util.ArrayList;

public class book {
    int id;
    String bookname , bookauthor;
    int price;
    public book(int id, String bookname, String bookauthor, int price) {
        this.id = id;
        this.bookname = bookname;
        this.bookauthor = bookauthor;
        this.price = price;
    }

    public static void main(String[] args) {
        
        book info = new book(21, "secret", "Anil", 999);
        book info1 = new book(234, "light", "oda", 1999);

        ArrayList<book> alpha = new ArrayList<>();

        alpha.add(info);
        alpha.add(info1);

        for(book a : alpha){
            System.out.println("Register No : " + a.id 
            + " Book Name : " + a.bookname + " Author : " 
            + a.bookauthor + " Price : " + a.price+"Rs");
        }
    }
}
