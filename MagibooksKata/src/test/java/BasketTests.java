import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketTests {
    @Test
    void whenBookAddedToBasket_ThenBasketIsCorrect()
    {
        int bookId = 10;

        Basket b = new Basket();

        b.addBook(new Book(bookId));

        assertEquals(1, b.books.size());
        assertEquals(bookId, b.books.getFirst().getBookId());
    }
}
