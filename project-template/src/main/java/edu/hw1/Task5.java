package edu.hw1;

public final class Task5 {
    final private static int TEN = 10;
    final private static int HUNDRED = 100;
    private Task5(){}

    public static boolean isPalindromeDescendant(int number){
        if(getNumberLength(number) % 2 != 0){
            return false;
        }

        int localNumber = number;

        while(localNumber > 0 && getNumberLength(localNumber)>1){
            int reverseNumber = getReverseNumber(localNumber);
            if(localNumber == reverseNumber){
                return  true;
            }
            localNumber = getDescendant(localNumber);
        }

        return false;
    }

    private static int getReverseNumber(int number){
        int reverseNumber = 0;
        while (number > 0) {
            int lastDigit = number % TEN;
            reverseNumber = reverseNumber * TEN + lastDigit;
            number = number / TEN;
        }

        return reverseNumber;
    }

    private static int getDescendant(int number){
        int descendant = 0;
        int iteration = 0;
        while(number > 0){
            int firstDigit = number%TEN;
            int secondDigit = number/TEN%TEN;
            descendant = descendant + (firstDigit+secondDigit)* (int)(Math.pow(TEN, iteration));
            number = number / HUNDRED;
            iteration++;
        }
        return descendant;
    }

    private static int getNumberLength(int number){
        int length = 0;
        while(number > 0){
            length++;
            number = number / TEN;
        }
        return length;
    }

}
