import java.util.ArrayList;

public class LibraryDriver {

    public static void main(String[] args) {

        ArrayList<Book> libraries = new ArrayList<>();

        libraries.add(new Book("xyz", "a", 200));

        Book book = new Book("asd", "b", 200);
        Book book1 = new Book("asd", "b", 200);
        Book book2= new Book("asd", "b", 200);
        libraries.add(book);
        libraries.add(book1);
        libraries.add(book2);



    }
}
