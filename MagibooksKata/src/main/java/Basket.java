import java.util.List;
import java.util.ArrayList;

public class Basket {
    List<Book> books = new ArrayList<>();


    public double getTotal()  {
        return 0;
    }

    public void addBook(Book book) {
        books.add(book);
    }
}
