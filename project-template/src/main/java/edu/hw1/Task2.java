package edu.hw1;

public final class Task2 {
    private Task2(){}
    final private static int TEN = 10;
    public static int countDigits(int number) {
        int digitCount = 1;
        int privateNumber = number;
        while (privateNumber / TEN != 0) {
            digitCount++;
            privateNumber = privateNumber / TEN;
        }
        return digitCount;
    }
}
