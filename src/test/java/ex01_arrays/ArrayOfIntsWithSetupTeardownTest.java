package ex01_arrays;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This Test is only to demonstrate setup and teardown.
 * It is not a good practice to use println in unit tests.
 * It clutters the output of the tests.
 */
class ArrayOfIntsWithSetupTeardownTest {

    private final ArrayOfInts arrayOfInts = new ArrayOfInts();

    @BeforeAll
    static void setupBeforeAll() {
        System.out.println("- setup before all");
    }

    @BeforeEach
    void setupBeforeEach() {
        System.out.println("-- setup before each");
    }

    @AfterAll
    static void teardownAfterAll() {
        System.out.println("- teardown after all");
    }

    @AfterEach
    void teardownAfterEach() {
        System.out.println("-- teardown after each");
    }

    @Test
    void happyflow() {
        System.out.println("--- test happyflow");
        int result = arrayOfInts.sumOfInts(new int[]{1, 2, 3, 4});
        assertEquals(10, result);
    }

    @Test
    void emptyArray() {
        System.out.println("--- emptyArray");
        int result = arrayOfInts.sumOfInts(new int[]{});
        assertEquals(0, result);
    }

    @Test
    void nullArray() {
        System.out.println("--- nullArray");
        int result = arrayOfInts.sumOfInts(null);
        assertEquals(0, result);
    }
}