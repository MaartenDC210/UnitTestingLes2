package ex01_arrays_OPL;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOfIntsCountMostPopularNumberTest {
    private final ArrayOfInts arrayOfInts = new ArrayOfInts();

    @Test
    public void nullArray() {
        int result = arrayOfInts.countMostPopularNumber(null);
        assertEquals(0, result);
    }

    @Test
    public void emptyArray() {
        int result = arrayOfInts.countMostPopularNumber(new int[]{});
        assertEquals(0, result);
    }

    @Test
    public void oneNumber() {
        int result = arrayOfInts.countMostPopularNumber(new int[]{33});
        assertEquals(1, result);
    }

    @Test
    public void differentNumbers() {
        int result = arrayOfInts.countMostPopularNumber(new int[]{33, 24, 36});
        assertEquals(1, result);
    }

    @Test
    public void equalNumbers() {
        int result = arrayOfInts.countMostPopularNumber(new int[]{24, 24, 36});
        assertEquals(2, result);
    }

    @Test
    public void severalEqualNumbers() {
        int result = arrayOfInts.countMostPopularNumber(new int[]{24, 36, 12, 24, 15, 36, 12, 10, 36});
        assertEquals(3, result);
    }
}
