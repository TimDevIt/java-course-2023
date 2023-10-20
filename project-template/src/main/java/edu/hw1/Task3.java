package edu.hw1;


public final class Task3 {
    private Task3() {}

    public static boolean isNestable(int[] arrayA, int[] arrayB) {
        try {
            if (arrayA == null || arrayB == null || arrayA.length == 0 || arrayB.length == 0) {
                throw new NullPointerException("One of the arrays is null or empty.");
            }
            return getMin(arrayA) > getMin(arrayB)
                || getMax(arrayA) < getMax(arrayB);
        } catch (NullPointerException exception) {
            return false;
        }
    }

    private static int getMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int element : array) {
            min = Math.min(min, element);
        }
        return min;
    }

    private static int getMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int element : array) {
            max = Math.max(max, element);
        }
        return max;
    }

}
