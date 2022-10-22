package MethodsOfclassObject;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Ticket {
    int number;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return number == ticket.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
class Book {
    String autor;
    String name;
}
public class Main extends Object{
    private int value;



    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        ticket.number =1234;
        Book book = new Book();
        book.autor ="Karnegy";
        book.name = "How to get friends";
        Map<Ticket, Book> library = new HashMap<>();
        library.put(ticket, book);

        Ticket ticket2 = new Ticket();
        ticket2.number = 1234;

        Book karenegiBook = library.get(ticket2);
        System.out.println(karenegiBook.autor);





    }
}
