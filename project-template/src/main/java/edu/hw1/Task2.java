package edu.hw1;

public final class Task2 {
    private static final int SPLITTER = 10;



    private Task2() {}

    public static int countDigits(int number) {
        int digitCount = 1;
        int privateNumber = number;
        while (privateNumber / SPLITTER != 0) {
            digitCount++;
            privateNumber = privateNumber / SPLITTER;
        }
        return digitCount;
    }
}
