import java.util.List;
import java.util.ArrayList;

public class Basket {
    List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }
}
