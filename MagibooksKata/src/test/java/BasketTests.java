import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketTests {
    @Test
    void WhenNoBooks_ThenZeroTotal() {
        Basket b = new Basket();

        double basketTotal = b.getTotal();

        assertEquals(0, basketTotal);
    }
}
