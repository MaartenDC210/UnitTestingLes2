package ex02_product_description_OPL;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {
    @Test
    void commonElements_allNull() {
        Product p = new Product("empty", null, null);
        String result = p.productDescription();
        assertEquals("", result);
    }
    @Test
    void commonElements_sizeSet_percentageNull() {
        Product p = new Product("empty", 25, null);
        String result = p.productDescription();
        assertEquals(" • 25CL", result);
    }
    @Test
    void commonElements_sizeNull_percentageSet() {
        Product p = new Product("empty", null, 8.0);
        String result = p.productDescription();
        assertEquals(" • 8%", result);
    }
    @Test
    void commonElements_allSet() {
        Product p = new Product("empty", 33, 6.0);
        String result = p.productDescription();
        assertEquals(" • 33CL 6%", result);
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
