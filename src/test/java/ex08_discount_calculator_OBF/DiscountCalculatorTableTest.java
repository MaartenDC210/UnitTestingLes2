package ex08_discount_calculator_OBF;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountCalculatorTableTest {
    private final DiscountCalculator calc = new DiscountCalculator();

    @ParameterizedTest
    @CsvSource({
            "  0,  0, 10, no price",
            "  0, 10,  0, no amount",
            " 10, 10,  1, amount<10",
            " 90, 10,  9, amount<10    - price is 10E*9",
            " 99, 10, 10, amount=10    - price is 10E*9 + 9E*1",
            "108, 10, 11, 10<amount<20 - price is 10E*9 + 9E*2",
            "188, 10, 20, amount=20    - price is 10E*9 + 9E*10 + 8E*1",
            "428, 10, 50, amount=50    - price is 10E*9 + 9E*10 + 8E*31",
            " 42,  1, 50, amount=50    - price is 1E*9 + 0.9E*10 + 0.8E*31",
    })
    public void normalPrices(int expectedResult, int price, int amount, String message) {
        assertEquals(expectedResult, calc.calculatePrice(price, amount), message);
    }
}
