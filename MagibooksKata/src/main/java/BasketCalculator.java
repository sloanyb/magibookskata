public class BasketCalculator {
    private final Basket basket;
    private final DiscountCalculator discountCalculator;

    public BasketCalculator(Basket basket, DiscountCalculator discountCalculator) {

        this.basket = basket;
        this.discountCalculator = discountCalculator;
    }

    public double getBasketTotal() {
        double totalBeforeDiscount = 0;
        for (int i=0; i<basket.books.size(); i++) {
            totalBeforeDiscount += basket.books.get(i).getPrice();
        }

        return totalBeforeDiscount - discountCalculator.getDiscountAmountPounds();
    }
}