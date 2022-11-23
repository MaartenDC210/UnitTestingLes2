package ex01_arrays_OPL;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayOfInts {

    public int sumOfInts(int[] arrayOfInts) {
        if (arrayOfInts == null) return 0;
        int sum = 0;
        for (int i : arrayOfInts)
            sum += i;
        return sum;
    }

    public int sumOf3SmallestInts(int[] arrayOfInts) {
        if (arrayOfInts == null) return 0;
        int[] copy = Arrays.copyOf(arrayOfInts, arrayOfInts.length);
        Arrays.sort(copy);
        return sumOfInts(Arrays.copyOf(copy, 3));
    }

    public int sumOfEven(int[] arrayOfInts) {
        if (arrayOfInts == null) return 0;
        int[] even = new int[arrayOfInts.length];
        int evenLength = 0;
        for (int i : arrayOfInts)
            if (i % 2 == 0) even[evenLength++] = i;
        return sumOfInts(even);
    }

    public int sumOfXLargest(int[] arrayOfInts, int x) {
        if (arrayOfInts == null || x <= 0 || arrayOfInts.length == 0) return 0;
        int[] copy = Arrays.copyOf(arrayOfInts, arrayOfInts.length);
        Arrays.sort(copy);
        return sumOfInts(Arrays.copyOfRange(copy,
                arrayOfInts.length - Math.min(x, arrayOfInts.length),
                arrayOfInts.length));
    }

    public int countMostPopularNumber(int[] arrayOfInts) {
        if (arrayOfInts == null) return 0;
        HashMap<Integer, Integer> occurencesCounter = new HashMap<>();
        for (int i : arrayOfInts) {
            occurencesCounter.put(i, occurencesCounter.getOrDefault(i, 0) + 1);
        }
        int maxOccurence = 0;
        for (Integer number : occurencesCounter.keySet()) {
            final Integer occurence = occurencesCounter.get(number);
            maxOccurence = Math.max(occurence, maxOccurence);
        }
        return maxOccurence;
    }

    public static void main(String[] args) {
        ArrayOfInts ex1 = new ArrayOfInts();
        int result = ex1.sumOfInts(new int[]{1, 2, 3, 4});
        System.out.println(result);
    }
}
