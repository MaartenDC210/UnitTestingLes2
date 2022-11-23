package ex03_more_arrays_OPL;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayOfInts {
    //write the tests for this code
    public int[] findDuplicateValues(int[] arrayOfInts) {
        if (arrayOfInts == null) return new int[]{};

        HashMap<Integer, Integer> count = new HashMap<>();
        for (int number : arrayOfInts) {
            Integer value = count.get(number);
            count.put(number, value == null ? 1 : value + 1);
        }
        int[] duplicates = new int[arrayOfInts.length];
        int nrOfDuplicates = 0;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() > 1) duplicates[nrOfDuplicates++] = entry.getKey();
        }
        return Arrays.copyOf(duplicates, nrOfDuplicates);
    }

    public int[] findCommonElements(int[] arrLeft, int[] arrRight) {
        if (arrLeft == null || arrRight == null) return new int[]{};

        Integer[] arrRightIntegers = new Integer[arrRight.length];
        for (int i = 0; i < arrRight.length; i++) {
            arrRightIntegers[i] = arrRight[i];
        }
        int[] commons = new int[arrLeft.length];
        int nrOfCommons = 0;
        for (int numberLeft : arrLeft) {
            boolean found = false;
            for (int i = 0; !found && i < arrRightIntegers.length; i++) {
                if (arrRightIntegers[i] != null && numberLeft == arrRightIntegers[i]) {
                    commons[nrOfCommons++] = numberLeft;
                    arrRightIntegers[i] = null;
                    found = true;
                }
            }
        }
        return Arrays.copyOf(commons, nrOfCommons);
    }

}
