import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketCalculatorTests {
    @Test
    void whenNoBooks_ThenZeroTotal() {
        Basket b = new Basket();
        BasketCalculator calculator = new BasketCalculator(b);

        double basketTotal = calculator.getBasketTotal();

        assertEquals(0, basketTotal);
    }

    @Test
    void whenOneBook_ThenCorrectAmount() {
        Basket basket = new Basket();
        Book book = new Book(1);

        basket.addBook(book);

        BasketCalculator calculator = new BasketCalculator(basket);
        double basketTotal = calculator.getBasketTotal();

        assertEquals(8.00, basketTotal);
    }

    @Test
    void whenTwoDifferentBooks_ThenDiscountApplied() {
        Basket basket = new Basket();

        Book bookOne = new Book(1);
        Book bookTwo = new Book(2);

        basket.addBook(bookOne);
        basket.addBook(bookTwo);

        BasketCalculator calculator = new BasketCalculator(basket);
        double basketTotal = calculator.getBasketTotal();

        assertEquals(15.2, basketTotal);
    }
}

