import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class BasketCalculatorTests {
    @Test
    void whenNoBooks_ThenZeroTotal() {
        Basket b = new Basket();
        DiscountCalculator discountCalculator = mock(DiscountCalculator.class);
        when(discountCalculator.getDiscountAmountPounds()).thenReturn(0f);

        BasketCalculator calculator = new BasketCalculator(b, discountCalculator);

        double basketTotal = calculator.getBasketTotal();

        assertEquals(0, basketTotal);
        verify(discountCalculator, times(1)).getDiscountAmountPounds();
    }

    @Test
    void whenOneBookAndNoDiscount_ThenCorrectAmount() {
        Basket basket = new Basket();
        DiscountCalculator discountCalculator = mock(DiscountCalculator.class);
        when(discountCalculator.getDiscountAmountPounds()).thenReturn(0f);
        Book book = new Book(1);

        basket.addBook(book);

        BasketCalculator calculator = new BasketCalculator(basket, discountCalculator);
        double basketTotal = calculator.getBasketTotal();

        assertEquals(8.00, basketTotal);
        verify(discountCalculator, times(1)).getDiscountAmountPounds();
    }

    @Test
    void whenTwoBooksAndDiscount_ThenDiscountApplied() {
        Basket basket = new Basket();
        DiscountCalculator discountCalculator = mock(DiscountCalculator.class);
        when(discountCalculator.getDiscountAmountPounds()).thenReturn(0.8f);

        Book bookOne = new Book(1);
        Book bookTwo = new Book(2);

        basket.addBook(bookOne);
        basket.addBook(bookTwo);

        BasketCalculator calculator = new BasketCalculator(basket, discountCalculator);
        float basketTotal = calculator.getBasketTotal();

        assertEquals(15.2f, basketTotal);
        verify(discountCalculator, times(1)).getDiscountAmountPounds();
    }
}