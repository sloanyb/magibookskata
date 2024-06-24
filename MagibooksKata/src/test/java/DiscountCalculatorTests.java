import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountCalculatorTests {
    @Test
    void whenOneBook_ThenNoDiscountApplied() {
        Basket basket = new Basket();

        Book bookOne = new Book(1);

        basket.addBook(bookOne);

        SeriesMultiBuyDiscountCalculator calculator = new SeriesMultiBuyDiscountCalculator(basket);
        double discountAmountPounds = calculator.getDiscountAmountPounds();

        assertEquals(0f, discountAmountPounds);
    }

    @Test
    void whenTwoDifferentBooks_ThenDiscountApplied() {
        Basket basket = new Basket();

        Book bookOne = new Book(1);
        Book bookTwo = new Book(2);

        basket.addBook(bookOne);
        basket.addBook(bookTwo);

        SeriesMultiBuyDiscountCalculator calculator = new SeriesMultiBuyDiscountCalculator(basket);
        double discountAmountPounds = calculator.getDiscountAmountPounds();

        assertEquals(0.8f, discountAmountPounds);
    }

    @Test
    void whenThreeDifferentBooks_ThenDiscountApplied() {
        Basket basket = new Basket();

        Book bookOne = new Book(1);
        Book bookTwo = new Book(2);
        Book bookThree = new Book(3);

        basket.addBook(bookOne);
        basket.addBook(bookTwo);
        basket.addBook(bookThree);

        SeriesMultiBuyDiscountCalculator calculator = new SeriesMultiBuyDiscountCalculator(basket);
        float discountAmountPounds = calculator.getDiscountAmountPounds();

        assertEquals(2.4f, discountAmountPounds);
    }

    @Test
    void whenFourDifferentBooks_ThenDiscountApplied() {
        Basket basket = new Basket();

        Book bookOne = new Book(1);
        Book bookTwo = new Book(2);
        Book bookThree = new Book(3);
        Book bookFour = new Book(4);

        basket.addBook(bookOne);
        basket.addBook(bookTwo);
        basket.addBook(bookThree);
        basket.addBook(bookFour);

        SeriesMultiBuyDiscountCalculator calculator = new SeriesMultiBuyDiscountCalculator(basket);
        float discountAmountPounds = calculator.getDiscountAmountPounds();

        assertEquals(6.4f, discountAmountPounds);
    }

    @Test
    void whenFiveDifferentBooks_ThenDiscountApplied() {
        Basket basket = new Basket();

        Book bookOne = new Book(1);
        Book bookTwo = new Book(2);
        Book bookThree = new Book(3);
        Book bookFour = new Book(4);
        Book bookFive = new Book(5);

        basket.addBook(bookOne);
        basket.addBook(bookTwo);
        basket.addBook(bookThree);
        basket.addBook(bookFour);
        basket.addBook(bookFive);

        SeriesMultiBuyDiscountCalculator calculator = new SeriesMultiBuyDiscountCalculator(basket);
        float discountAmountPounds = calculator.getDiscountAmountPounds();

        assertEquals(10f, discountAmountPounds);
    }

}


