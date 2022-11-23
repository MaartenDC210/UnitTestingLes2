package ex03_more_arrays_OPL;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FindCommonElementsTest {
    ArrayOfInts arrayOfInts = new ArrayOfInts();

    //Write the code for these tests
    @Test
    void arraysEmpty() {
        int[] result = arrayOfInts.findCommonElements(new int[]{}, new int[]{});
        int[] expected = new int[]{};
        assertArrayEquals(expected, result);
    }

    @Test
    void noEquals() {
        int[] result = arrayOfInts.findCommonElements(new int[]{1, 2}, new int[]{3, 4});
        int[] expected = new int[]{};
        assertArrayEquals(expected, result);
    }

    @Test
    void found1Equal() {
        int[] result = arrayOfInts.findCommonElements(new int[]{1, 2}, new int[]{3, 1, 4});
        int[] expected = new int[]{1};
        assertArrayEquals(expected, result);
    }

    @Test
    void found2Equals() {
        int[] result = arrayOfInts.findCommonElements(new int[]{1, 2, 3}, new int[]{3, 1, 4});
        int[] expected = new int[]{1, 3};
        assertArrayEquals(expected, result);
    }

    @Test
    void foundSameNumberTwice() {
        int[] result = arrayOfInts.findCommonElements(new int[]{1, 1, 3}, new int[]{4, 1, 1});
        int[] expected = new int[]{1, 1};
        assertArrayEquals(expected, result);
    }

    @Test
    void foundSameNumberOnceRight() {
        int[] result = arrayOfInts.findCommonElements(new int[]{1, 1, 3}, new int[]{4, 1});
        int[] expected = new int[]{1};
        assertArrayEquals(expected, result);
    }

    @Test
    void foundSameNumberOnceLeft() {
        int[] result = arrayOfInts.findCommonElements(new int[]{1, 3}, new int[]{4, 1, 1});
        int[] expected = new int[]{1};
        assertArrayEquals(expected, result);
    }

    @Test
    void leftNull() {
        int[] result = arrayOfInts.findCommonElements(null, new int[]{4, 1, 1});
        int[] expected = new int[]{};
        assertArrayEquals(expected, result);
    }

    @Test
    void rightNull() {
        int[] result = arrayOfInts.findCommonElements(new int[]{4, 1, 1}, null);
        int[] expected = new int[]{};
        assertArrayEquals(expected, result);
    }

}

