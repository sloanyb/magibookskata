import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTests {

    void whenBookCreated_ThenPriceIsSet() {
        Book b = new Book(12);

        assertEquals(8, b.getPrice());
    }

}
