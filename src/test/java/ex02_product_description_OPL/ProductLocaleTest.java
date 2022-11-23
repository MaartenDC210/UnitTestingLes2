package ex02_product_description_OPL;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductLocaleTest {
    Locale originalLocale;

    @BeforeEach
    void setup() {
        originalLocale = Locale.getDefault();
        Locale.setDefault(Locale.FRANCE);
    }

    @AfterEach
    void teardown() {
        Locale.setDefault(originalLocale);
    }

    @Test
    void commonElements_percentageWithDecimal() {
        Product p = new Product("empty", 33, 6.3);
        String result = p.productDescription();
        assertEquals(" • 33CL 6.3%", result);
    }

    @Test
    void commonElements_percentageWithTooMuchDecimals() {
        Product p = new Product("empty", 33, 6.333);
        String result = p.productDescription();
        assertEquals(" • 33CL 6.3%", result);
    }
}
