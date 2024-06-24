public class SeriesMultiBuyDiscountCalculator implements DiscountCalculator {

    private final Basket basket;

    public SeriesMultiBuyDiscountCalculator(Basket basket) {

        this.basket = basket;
    }

    @Override
    public double getDiscountAmountPounds() {
        int numberOfBooksInBasket = basket.books.size();
        double discountMultiplier = 0;

        if (numberOfBooksInBasket == 2) {
            if (basket.books.getFirst().getBookId() != basket.books.getLast().getBookId()) {
                discountMultiplier = 0.05;
            }
        }

        double total = 0;
        for (int i=0; i<basket.books.size(); i++) {
            total += basket.books.get(i).getPrice();
        }

        return total * discountMultiplier;
    }
}
