package ex08_discount_calculator_OBF;


public class DiscountCalculator {

    public int calculatePrice(int price, int amount) {
        return calculateNormalPrice(price, amount);
    }

    private int calculateNormalPrice(int price, int amount) {
        if (amount < 10)
            return price * amount;
        if (amount < 20)
            return (int) (price * 9 + price * 0.9 * (amount - 9));
        if (amount < 50)
            return (int) (price * 9 + price * 0.9 * 10 + price * 0.8 * (amount - 19));

        return (int) (price * 9 + price * 0.9 * 10 + price * 0.8 * (amount - 19));
    }
}


