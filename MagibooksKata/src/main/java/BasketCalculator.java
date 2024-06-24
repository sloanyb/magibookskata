public class BasketCalculator {
    private final Basket basket;

    public BasketCalculator(Basket basket) {
        this.basket = basket;
    }

    public double getBasketTotal() {
        double pricePerBook = 8;
        int numberOfBooksInBasket = basket.books.size();

        return pricePerBook * numberOfBooksInBasket;
    }
}
