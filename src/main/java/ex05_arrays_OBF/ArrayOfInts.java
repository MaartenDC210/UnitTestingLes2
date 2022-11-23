package ex05_arrays_OBF;

public class ArrayOfInts {

    public int sumOfElementsInArray(int[] array) {
        if (array == null) return 0;
        int sum = 0;

        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public int sumOfEvenNumbers(int[] array) {
        if (array == null) return 0;

        int sum = 0;
        for (int element : array) {
            if (element % 2 == 0)
                sum += element;
        }

        return sum;
    }

}
