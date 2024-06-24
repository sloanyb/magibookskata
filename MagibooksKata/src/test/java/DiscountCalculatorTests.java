import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountCalculatorTests {
    @Test
    void whenTwoDifferentBooks_ThenDiscountApplied() {
        Basket basket = new Basket();

        Book bookOne = new Book(1);
        Book bookTwo = new Book(2);

        basket.addBook(bookOne);
        basket.addBook(bookTwo);

        SeriesMultiBuyDiscountCalculator calculator = new SeriesMultiBuyDiscountCalculator(basket);
        double discountAmountPounds = calculator.getDiscountAmountPounds();

        assertEquals(0.8, discountAmountPounds);
    }

}


