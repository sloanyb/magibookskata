import java.util.stream.Collectors;

public class SeriesMultiBuyDiscountCalculator implements DiscountCalculator {

    private final Basket basket;

    public SeriesMultiBuyDiscountCalculator(Basket basket) {

        this.basket = basket;
    }

    @Override
    public float getDiscountAmountPounds() {
        int distinctBookIds = basket.books.stream().map(Book::getBookId).collect(Collectors.toList()).stream().distinct().toList().size();

        float discountMultiplier = switch (distinctBookIds) {
            case 2 -> 0.05f;
            case 3 -> 0.1f;
            default -> 0;
        };

        float total = 0;

        for (int i = 0; i < basket.books.size(); i++) {
            total += basket.books.get(i).getPrice();
        }

        return total * discountMultiplier;
    }
}
