package ex05_arrays_OBF;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayOfIntsFunctie2Test {

    private final ArrayOfInts arrayOfInts = new ArrayOfInts();

    @Test
    void test1() {
        int result = arrayOfInts.sumOfEvenNumbers(new int[]{2, 4});
        assertEquals(6, result);
    }

    @Test
    void test2() {
        int result = arrayOfInts.sumOfEvenNumbers(new int[]{1, 2, 7, 6});
        assertEquals(8, result);
    }

    @Test
    void test3() {
        int result = arrayOfInts.sumOfEvenNumbers(new int[]{7, 1, 3});
        assertEquals(0, result);
    }

    @Test
    void tets4() {
        int result = arrayOfInts.sumOfEvenNumbers(new int[]{});
        assertEquals(0, result);
    }

    @Test
    void test5() {
        int result = arrayOfInts.sumOfEvenNumbers(null);
        assertEquals(0, result);
    }

}