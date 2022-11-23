package ex08_discount_calculator_OBF;


public class DiscountCalculator {

    public int calculatePrice(int price, int amount) {
        if (amount < 10)
            return price * amount;
        else if (amount < 20)
            return (int) (price * 9 + price * 0.9 * (amount - 9));
        else
            return (int) (price * 9 + price * 0.9 * 10 + price * 0.8 * (amount - 19));
    }


}


