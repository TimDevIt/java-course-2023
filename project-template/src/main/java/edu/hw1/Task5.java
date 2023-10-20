package edu.hw1;

public final class Task5 {
    private static final int SPLITTER = 10;

    private Task5() {}

    public static boolean isPalindromeDescendant(int number) {
        if (getNumberLength(number) % 2 != 0) {
            return false;
        }

        int localNumber = number;

        while (localNumber > 0 && getNumberLength(localNumber) > 1) {
            int reverseNumber = getReverseNumber(localNumber);
            if (localNumber == reverseNumber) {
                return true;
            }
            localNumber = getDescendant(localNumber);
        }

        return false;
    }

    private static int getReverseNumber(int number) {
        int localNumber = number;
        int reverseNumber = 0;
        while (localNumber > 0) {
            int lastDigit = localNumber % SPLITTER;
            reverseNumber = reverseNumber * SPLITTER + lastDigit;
            localNumber = localNumber / SPLITTER;
        }

        return reverseNumber;
    }

    private static int getDescendant(int number) {
        int localNumber = number;
        int descendant = 0;
        int iteration = 0;
        while (localNumber > 0) {
            int firstDigit = localNumber % SPLITTER;
            int secondDigit = localNumber / SPLITTER % SPLITTER;
            descendant = descendant + (firstDigit + secondDigit) * (int) (Math.pow(SPLITTER, iteration));
            localNumber = localNumber / SPLITTER / SPLITTER;
            iteration++;
        }
        return descendant;
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

}
