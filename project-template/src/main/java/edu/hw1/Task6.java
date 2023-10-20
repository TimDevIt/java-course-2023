package edu.hw1;

import java.util.Arrays;


public final class Task6 {
    private static final int SPLITTER = 10;
    private static final int KAPREKAR_CONSTANT = 6174;
    private static final int VALID_NUMBER_SIZE = 4;

    private Task6() {}

    public static int countK(int number) {
        if (getNumberLength(number) != VALID_NUMBER_SIZE || isAllDigitAreSame(number)) {
            return -1;
        }
        return K(number, 0);
    }

    private static int K(int number, int count) {
        int sortedDeskNumber = getSortedDescNumber(number);
        int sortedAscNumber = getSortedAscNumber(number);
        int newNumber = 0;
        if (sortedAscNumber > sortedDeskNumber) {
            newNumber = sortedAscNumber - sortedDeskNumber;
        } else {
            newNumber = sortedDeskNumber - sortedAscNumber;
        }
        if (newNumber == KAPREKAR_CONSTANT) {
            return count + 1;
        } else {
            return K(newNumber, count + 1);
        }
    }

    private static int getSortedDescNumber(int number) {
        int[] digitArray = convertNumberToDigitArray(number);
        int newLength = digitArray.length;
        int[] copiedArray = Arrays.copyOf(digitArray, newLength);
        sortDescending(copiedArray);
        return convertDigitArrayToNumber(copiedArray);
    }

    private static int getSortedAscNumber(int number) {
        int[] digitArray = convertNumberToDigitArray(number);
        int newLength = digitArray.length;
        int[] copiedArray = Arrays.copyOf(digitArray, newLength);
        sortAscending(copiedArray);
        return convertDigitArrayToNumber(copiedArray);
    }

    private static int getNumberLength(int number) {
        int localNumber = number;
        int length = 0;
        while (localNumber > 0) {
            length++;
            localNumber = localNumber / SPLITTER;
        }
        return length;
    }

    private static int[] convertNumberToDigitArray(int number) {
        int localNumber = number;
        int numberLength = getNumberLength(number);
        int[] digitArray = new int[numberLength];
        for (int i = 0; i < numberLength; i++) {
            digitArray[i] = localNumber % SPLITTER;
            localNumber = localNumber / SPLITTER;
        }
        return digitArray;
    }

    private static int convertDigitArrayToNumber(int[] digitArray) {
        int newNumber = 0;
        for (int i = 0; i < digitArray.length; i++) {
            newNumber = newNumber + digitArray[i] * (int) Math.pow(SPLITTER, digitArray.length - i - 1);
        }
        return newNumber;
    }

    private static void sortDescending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    private static void sortAscending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    private static boolean isAllDigitAreSame(int number) {
        int[] digitArray = convertNumberToDigitArray(number);
        for (int i = 0; i < digitArray.length - 1; i++) {
            if (digitArray[i] != digitArray[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

