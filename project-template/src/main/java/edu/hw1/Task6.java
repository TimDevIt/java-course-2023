package edu.hw1;

import java.util.Arrays;
import java.util.Collections;

public final class Task6 {
    final private static int TEN = 10;
    final private static int KAPREKAR_CONSTANT = 6174;

    private Task6(){}

    public static int countK(int number){
        return K(number,0);
    }

    private static int K(int number, int count){
        int sortedDeskNumber = getSortedDescNumber(number);
        int sortedAscNumber = getSortedAscNumber(number);
        int newNumber = 0;
        if(sortedAscNumber > sortedDeskNumber){
            newNumber = sortedAscNumber - sortedDeskNumber;
        } else {
            newNumber = sortedDeskNumber - sortedAscNumber;
        }
        if(newNumber == KAPREKAR_CONSTANT) {
            return count + 1;
        } else {
            return K(newNumber, count + 1);
        }
    }

    private static int getSortedDescNumber(int number){
        int[] digitArray = ConvertNumberToDigitArray(number);
        int newLength = digitArray.length;
        int[] copiedArray = Arrays.copyOf(digitArray,newLength);
        sortDescending(copiedArray);
        return ConvertDigitArrayToNumber(copiedArray);
    }

    private static int getSortedAscNumber(int number){
        int[] digitArray = ConvertNumberToDigitArray(number);
        int newLength = digitArray.length;
        int[] copiedArray = Arrays.copyOf(digitArray,newLength);
        sortAscending(copiedArray);
        return ConvertDigitArrayToNumber(copiedArray);
    }

    private static int getNumberLength(int number){
        int length = 0;
        while(number > 0){
            length++;
            number = number / 10;
        }
        return length;
    }

    private static int[] ConvertNumberToDigitArray(int number){
        int numberLength = getNumberLength(number);
        int[] digitArray = new int[numberLength];
        for(int i = 0; i < numberLength; i++){
            digitArray[i] = number % 10;
            number = number / 10;
        }
        return digitArray;
    }

    private static int ConvertDigitArrayToNumber(int[] digitArray){
        int newNumber = 0;
        for(int i = 0; i < digitArray.length; i++){
            newNumber = newNumber + digitArray[i]*(int)Math.pow(TEN,digitArray.length - i);
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

}

