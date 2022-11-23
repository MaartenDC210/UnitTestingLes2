package ex01_arrays_OPL;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayOfIntsSumOf3SmallestTest {

    final private ArrayOfInts arrayOfInts = new ArrayOfInts();

    @Test
    void exactly3() {
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{3, 2, 1});
        assertEquals(6, result);
    }

    @Test
    void lessThan3() {
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{1, 7});
        assertEquals(8, result);
    }

    @Test
    void moreThan3Ints() {
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{7, 2, 3, 4});
        assertEquals(9, result);
    }

    @Test
    void moreThan3IntsWithNegatives() {
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{-7, 2, 3, 4});
        assertEquals(-2, result);
    }

    @Test
    void moreThan3IntsWithEquals() {
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{7, 2, 7, 2});
        assertEquals(11, result);
    }

    @Test
    void originalArrayNotModified() {
        int[] originalArrayOfInts = {7, 5, 3, 4, 7};
        arrayOfInts.sumOf3SmallestInts(originalArrayOfInts);
        assertArrayEquals(new int[]{7, 5, 3, 4, 7}, originalArrayOfInts);
    }

    @Test
    void emptyArray() {
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{});
        assertEquals(0, result);
    }

    @Test
    void nullArray() {
        int result = arrayOfInts.sumOf3SmallestInts(null);
        assertEquals(0, result);
    }
}