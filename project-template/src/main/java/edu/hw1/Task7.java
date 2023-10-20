package edu.hw1;

public final class Task7 {

    private Task7() {}

    public static int rotateLeft(int n, int shift) {
        int localShift = shift % getNumberOfBits(n);
        int[] bitArray = convertIntToBitArray(n);
        for (int i = 0; i < localShift; i++) {
            int firstBit = bitArray[0];
            for (int j = 0; j < bitArray.length - 1; j++) {
                bitArray[j] = bitArray[j + 1];
            }
            bitArray[bitArray.length - 1] = firstBit;
        }
        return convertBitArrayToInt(bitArray);
    }

    public static int rotateRight(int n, int shift) {
        int localShift = shift % getNumberOfBits(n);
        int[] bitArray = convertIntToBitArray(n);
        for (int i = 0; i < localShift; i++) {
            int lastBit = bitArray[bitArray.length - 1];
            for (int j = bitArray.length - 1; j > 0; j--) {
                bitArray[j] = bitArray[j - 1];
            }
            bitArray[0] = lastBit;
        }
        return convertBitArrayToInt(bitArray);
    }

    private static int[] convertIntToBitArray(int number) {
        int localNumber = number;
        int numberOfBits = getNumberOfBits(number);
        int[] bitArray = new int[numberOfBits];
        for (int i = bitArray.length - 1; i >= 0; i--) {
            bitArray[i] = localNumber % 2;
            localNumber /= 2;
        }
        return bitArray;
    }

    private static int convertBitArrayToInt(int[] bitArray) {
        int number = 0;
        for (int i = 0; i < bitArray.length; i++) {
            number += bitArray[i] * (int) Math.pow(2, bitArray.length - 1 - i);
        }
        return number;
    }

    private static int getNumberOfBits(int number) {
        String binaryString = Integer.toBinaryString(number);
        return binaryString.length();
    }
}
