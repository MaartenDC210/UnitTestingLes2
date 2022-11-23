package ex03_more_arrays_OPL;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FindDuplicateValuesTest {
    ArrayOfInts arrayOfInts = new ArrayOfInts();

    @Test
    void emptyArray() {
        int[] result = arrayOfInts.findDuplicateValues(new int[]{});
        int[] expected = new int[]{};
        assertArrayEquals(expected, result);
    }

    @Test
    void contains1Int() {
        int[] result = arrayOfInts.findDuplicateValues(new int[]{1});
        int[] expected = new int[]{};
        assertArrayEquals(expected, result);
    }

    @Test
    void contains2EqualInts() {
        int[] result = arrayOfInts.findDuplicateValues(new int[]{2, 2});
        int[] expected = new int[]{2};
        assertArrayEquals(expected, result);
    }

    @Test
    void contains2EqualIntsAndSomethingElse() {
        int[] result = arrayOfInts.findDuplicateValues(new int[]{2, 1, 2, 5});
        int[] expected = new int[]{2};
        assertArrayEquals(expected, result);
    }

    @Test
    void containsOnlyDifferentInts() {
        int[] result = arrayOfInts.findDuplicateValues(new int[]{3, 4, 5, 6});
        int[] expected = new int[]{};
        assertArrayEquals(expected, result);
    }

    @Test
    void contains3EqualsInts() {
        int[] result = arrayOfInts.findDuplicateValues(new int[]{5, 5, 5});
        int[] expected = new int[]{5};
        assertArrayEquals(expected, result);
    }

    @Test
    void contains5EqualsIntsAndSomethingElse() {
        int[] result = arrayOfInts.findDuplicateValues(new int[]{1, 3, 6, 4, 6, 6, 8, 6, 9, 6, 7});
        int[] expected = new int[]{6};
        assertArrayEquals(expected, result);
    }

    @Test
    void contains2DifferentDuplicates() {
        int[] result = arrayOfInts.findDuplicateValues(new int[]{1, 2, 1, 2, 3, 2});
        int[] expected = new int[]{1,2};
        assertArrayEquals(expected, result);
    }

    @Test
    void nullArray() {
        int[] result = arrayOfInts.findDuplicateValues(null);
        int[] expected = new int[]{};
        assertArrayEquals(expected, result);
    }


}
